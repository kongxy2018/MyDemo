package com.athome.springboot.controller;

//import com.athome.springboot.service.KafkaSender;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {
    private final org.slf4j.Logger log = LoggerFactory.getLogger(getClass());
    /*@Autowired
    private KafkaSender kafkaSender;*/

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        String str = "hha";
        System.out.println(str);
        log.info("this is logs print info...");
        //kafkaSender.send();
        return "Hello World!";
    }


    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "<h1>你好:kongxy</h1>");
        map.put("users", Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu"));
        return "success";
    }
}
