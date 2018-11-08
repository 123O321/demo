package com.example.demo.handler;

import com.alibaba.fastjson.JSONObject;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

/**
 * @Description //TODO
 * @Author wumeng
 * @Date 2018/11/1 16:27
 **/
@RestControllerAdvice
public class BindExceptionHanlder {

    @ExceptionHandler(BindException.class)
    public String handleBindException(BindException ex) {
        // ex.getFieldError():随机返回一个对象属性的异常信息。如果要一次性返回所有对象属性异常信息，则调用ex.getAllErrors()
        List<FieldError> list = ex.getFieldErrors();
        JSONObject msg = new JSONObject();
        for (FieldError fe : list) {
            msg.put(fe.getField(), fe.getDefaultMessage());
        }
        // 生成返回结果
        JSONObject result = new JSONObject();
        result.put("code", "400");
        result.put("msg", msg);
        return result.toJSONString();
    }
}
