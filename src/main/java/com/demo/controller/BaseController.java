package com.demo.controller;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

public class BaseController {
    @ExceptionHandler
    @ResponseBody
    public String doError(Exception ex){
        ex.printStackTrace();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("success",0);
        jsonObject.put("msg","程序运行出现异常");
        return jsonObject.toString();
    }
}
