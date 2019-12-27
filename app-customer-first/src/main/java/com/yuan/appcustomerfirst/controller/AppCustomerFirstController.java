package com.yuan.appcustomerfirst.controller;

import com.yuan.appcustomerfirst.service.AppCustomerFirstServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppCustomerFirstController {
    @Autowired
    private AppCustomerFirstServer appCustomerFirstServer;
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return appCustomerFirstServer.test();
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    public String test1() {
        return "这是测试，路由拦截转发成功";
    }

}

