package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by D N on 2018/1/19.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(Model model) {
        return "This is hello!";
    }

    @RequestMapping("/freeMarker")
    public String freeMarker(Model model){
        model.addAttribute("user", "tang");
        model.addAttribute("fetch", "fetch");
        return "index";
    }
}
