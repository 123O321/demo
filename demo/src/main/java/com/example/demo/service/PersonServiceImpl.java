package com.example.demo.service;

import com.example.demo.mapper.PersonMapper;
import com.example.demo.model.Person;
import com.example.demo.model.PersonExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description //TODO
 * @Author wumeng
 * @Date 2018/11/8 15:38
 **/
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public Map<String, Object> pageFind(Integer pageNo, Integer pageSize, PersonExample condition) {
        if (pageNo == null) {
            pageNo = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        PageHelper.startPage(pageNo, pageSize, true);
        List<Person> list = personMapper.selectByExample(condition);
        PageInfo info = new PageInfo(list);
        Map<String, Object> data = new HashMap<>();
        data.put("total", info.getTotal());
        data.put("list", list);
        return data;
    }
}
