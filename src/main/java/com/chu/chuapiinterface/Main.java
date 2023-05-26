package com.chu.chuapiinterface;

import com.chu.chuapiinterface.client.ChuApiClient;
import com.chu.chuapiinterface.model.User;

public class Main {
    public static void main(String[] args) {
        String accessKey = "chu";
        String secretKey = "12345678";
        ChuApiClient chuApiClient = new ChuApiClient(accessKey,secretKey);
        String result1 = chuApiClient.getNameByGet("chu");
        String result2 = chuApiClient.getNameByPost("chu");

        User user = new User();
        user.setName("chuuu");
        System.out.println(user.getName());
        String result3 = chuApiClient.getUsernameByPost(user);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}