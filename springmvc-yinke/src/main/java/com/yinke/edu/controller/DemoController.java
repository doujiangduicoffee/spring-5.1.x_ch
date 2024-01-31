package com.yinke.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

/**
 * @author 仙道
 */
@Controller
@RequestMapping("/demo")
public class DemoController  {


    @RequestMapping("/handle01")
    public String handle01(String name,Map<String,Object> model) {
		System.out.println("++++++++handler业务逻辑处理中....");
        Date date = new Date();
        model.put("date",date);
        return "success";
    }
}
