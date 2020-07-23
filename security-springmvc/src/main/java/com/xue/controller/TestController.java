package com.xue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Test控制类
 *
 * @author ：HUANG ZHI XUE
 * @date ：Create in 2020-07-19
 */
@Controller
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/index/")
    public String index() {
        return "index";
    }
}
