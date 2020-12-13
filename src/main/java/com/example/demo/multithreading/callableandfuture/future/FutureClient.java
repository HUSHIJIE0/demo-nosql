package com.example.demo.multithreading.callableandfuture.future;

public class FutureClient {

    public Data request(String queryStr) {
        FutureData furureData = new FutureData();
        new Thread(() -> {
            RealData realData = new RealData(queryStr);
            furureData.setRealData(realData);
        }).start();
        return furureData;
    }


    public static void main(String[] args) {
        FutureClient futureClient = new FutureClient();
        Data request = futureClient.request("请求参数.");
        System.out.println("请求发送成功!");
        System.out.println("执行其他任务...");
        String result = request.getRequest();
        System.out.println("获取到结果..." + result);
    }

}
