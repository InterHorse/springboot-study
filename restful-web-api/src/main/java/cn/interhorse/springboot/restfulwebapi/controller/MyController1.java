package cn.interhorse.springboot.restfulwebapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 普通示例
 *
 * @author InterHorse
 * @date 2020-06-12
 */
@Controller
public class MyController1 {
    @ResponseBody
    @RequestMapping(value = "/test")
    private String test() {
        return "Hello world!";
    }
}
