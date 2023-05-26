package com.chu.chuapiinterface.controller;

import cn.hutool.http.HttpRequest;
import com.chu.chuapiinterface.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 名称api
 *
 * @author Chu
 */

@RestController
@RequestMapping("/name")
public class NameController {
    @GetMapping("/")
    public String getNameByGet(String name) {
        return "GET 你的名字是：" + name;
    }

    @PostMapping("/user")
    public String getNameByPost(String name) {
        return "Post 你的名字是：" + name;
    }

    @PostMapping("/restful")
    public String getNameByRest(@RequestBody User user, HttpServletRequest request) {
        String accessKey = request.getHeader("accessKey");
        String secretKey = request.getHeader("secretKey");
        if (!accessKey.equals("chu") || !secretKey.equals("12345678")) {
            throw new RuntimeException("无权限");
        }
        System.out.println(user.getName());
        return "restful 你的名字是：" + user.getName();
    }
}
