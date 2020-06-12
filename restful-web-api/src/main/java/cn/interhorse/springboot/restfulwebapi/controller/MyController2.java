package cn.interhorse.springboot.restfulwebapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用 @RequestMapping 对类进行标注
 *
 * @author InterHorse
 * @date 2020-06-12
 */
@RestController
@RequestMapping(value = "/controller2")
public class MyController2 {
    @RequestMapping(value = "/test1")
    private String test1() {
        return "This is test1.";
    }

    @RequestMapping(value = "/test2")
    private String test2() {
        return "This is test2.";
    }
}
