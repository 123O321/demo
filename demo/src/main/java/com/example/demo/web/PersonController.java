package com.example.demo.web;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.Person;
import com.example.demo.model.PersonExample;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description //TODO
 * @Author wumeng
 * @Date 2018/11/8 15:42
 **/
@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/list")
    public String list(Integer pageNo, Integer pageSize, Person condition) {
        JSONObject result = new JSONObject();
        result.put("code", 0);
        result.put("data", personService.pageFind(pageNo, pageSize, new PersonExample()));
        return result.toJSONString();
    }
}
