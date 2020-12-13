package com.example.demo.io;

import sun.reflect.generics.tree.Tree;

import java.io.IOException;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;

import static java.nio.file.StandardWatchEventKinds.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2020/04/07/16:37
 * @Description:
 */
public class TreeWatcher {

    static String path = "C:\\opt";
    static Map<String, String> pathMap = new HashMap<>();//添加一次监听即可

    TreeWatcher(){
        pathMap.put(path, "I");
    }

    static void watchDir(Path dir){
        try {
            WatchService watcher =
                    FileSystems.getDefault().newWatchService();
            dir.register(watcher, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);

            Executors.newSingleThreadExecutor().submit(() -> {
                while (true) {
                    try {
                        WatchKey key = watcher.take();
                        for(WatchEvent evt : key.pollEvents()) {
                            //TODO 根据事件类型采取不同的操作。。。。。。。
                            System.out.println("["+dir+"/"+evt.context()+"]文件发生了["+evt.kind()+"]事件");
                            String newPath = dir + "/" +evt.context();
                            if (evt.kind().equals(ENTRY_CREATE)  && !pathMap.containsKey(newPath)) {
                                 doWatch(newPath);
                            }
                        }
                        key.reset();
                    } catch(Exception e) {
                        return;
                    }
                }
            });
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws Exception {
        doWatch(path);
    }

    private static void doWatch(String path) throws Exception{
        Files.walk(Paths.get(path))
                .filter(Files::isDirectory)
                .forEach(TreeWatcher::watchDir);
    }
}