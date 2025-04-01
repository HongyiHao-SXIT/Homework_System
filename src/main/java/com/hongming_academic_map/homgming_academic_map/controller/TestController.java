<<<<<<< HEAD
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
=======
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
>>>>>>> 2b2c06fa920178d49435315acd4cfc1353af164b
}