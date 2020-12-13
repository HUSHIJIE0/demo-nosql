package com.example.demo.multithreading.callableandfuture.future;

public class RealData extends Data {
    private String result;

    public RealData(String data) {
        System.out.println("正在使用data:" + data + "网络请求数据,耗时操作需要等待.");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {}
        System.out.println("操作完毕,生成结果...");
        result = "真实数据返回！";
    }

    @Override
    public String getRequest() {
        return result;
    }
}
