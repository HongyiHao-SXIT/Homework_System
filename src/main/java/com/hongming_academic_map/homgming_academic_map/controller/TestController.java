package com.hongming_academic_map.homgming_academic_map.controller;

import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
 
@Controller
public class TestController{
 
    @RequestMapping("/hello")
    public String getPage(HashMap<String, String> map){
        map.put("title", "欢迎来到Spring Boot!");
        return "/index";
    }

}