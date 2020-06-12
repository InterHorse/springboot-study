package cn.interhorse.springboot.restfulwebapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 有关 @RequestMapping 各种属性的示例
 *
 * @author InterHorse
 * @date 2020-06-12
 */
@RestController
@RequestMapping(value = "/controller3")
public class MyController3 {
    @RequestMapping(value = "/test1", method = {RequestMethod.POST})
    private String test1() {
        return "This is test1.";
    }

    @RequestMapping(value = "/test2", consumes = "application/json")
    private String test2() {
        return "This is test2.";
    }

    @RequestMapping(value = "/test3", params = "id=1")
    private String test3() {
        return "This is test3.";
    }
}
