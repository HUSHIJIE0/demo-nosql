package com.example.demo.kafka;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @program: demo
 * @description: 获取数据
 * @author: Michael
 * @create: 2019-05-08 10:02
 */
@Service
@Slf4j
public class SplitService {
    private static final Logger logger = LoggerFactory.getLogger(SplitService.class);

    public void saveAndSplitLog(String message) {
        JSONObject jsonObject = JSONObject.parseObject(message);
        // 从kafka 中获取到数据
        String content = jsonObject.getString("message");
        logger.info(content);
    }
}
