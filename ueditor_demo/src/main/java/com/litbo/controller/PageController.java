package com.litbo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    @RequestMapping("/index")
    public String index(){
        return "ueditor";
    }
    @ResponseBody
    @PostMapping("/submit")
    public String submit(String content){
        System.out.print(content);
        return "success";
    }
}
