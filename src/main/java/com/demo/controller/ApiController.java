package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ApiController extends  BaseController{
    @RequestMapping("/api")
    @ResponseBody
    public String apiTest(HttpServletRequest request, HttpServletResponse response)throws Exception{
        String str = "";
        return "hello ni ";
    }
}
