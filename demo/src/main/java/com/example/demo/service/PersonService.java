package com.example.demo.service;/**
 * @Description //TODO
 * @Author wumeng
 * @Date 2018/11/8 15:20
 **/

import com.example.demo.model.Person;
import com.example.demo.model.PersonExample;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Author wumeng
 * @Date 2018/11/8 15:20
 **/
public interface PersonService {
    Map<String, Object> pageFind(Integer pageNo, Integer pageSize, PersonExample condition);
}
