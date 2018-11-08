package com.example.demo.web;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Person;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description //TODO
 * @Author wumeng
 * @Date 2018/10/29 11:06
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping("/register")
    public String register(@Validated({Person.B.class}) Person record) {
        JSONObject js = new JSONObject();
        js.put("code", "200");
        js.put("msg", record);
        System.out.println("fdasfda");
        return js.toJSONString();
    }

    @PostMapping("/login")
    public String login() {
        return "";
    }
}
