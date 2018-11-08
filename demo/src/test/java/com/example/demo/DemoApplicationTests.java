package com.example.demo;

import com.example.demo.mapper.PersonMapper;
import com.example.demo.model.PersonExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest("com.example.demo.*")
public class DemoApplicationTests {
    @Autowired
    private PersonMapper personMapper;

    @Test
    public void contextLoads() {
        PageHelper.startPage(1, 2, true);
//        PageInfo pageInfo = new PageInfo(personMapper.selectByExample(new PersonExample()));
        System.out.println(personMapper.selectByExample(null));
    }

}
