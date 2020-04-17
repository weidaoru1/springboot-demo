package com.demo.controller;

import com.demo.common.util.SystemParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class TestController extends BaseController{
    @Autowired
    private SystemParams systemParams;

    @RequestMapping("/test")
    @ResponseBody
    public String testController(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("appKey:" + systemParams.getAppKey());
        System.out.println("appSecret:" + systemParams.getAppSecret());
        System.out.println("address:" + systemParams.getAddress());
        System.out.println("测试controller...");
        String str = "";
        return "hello ni hao ma!";
    }

}
