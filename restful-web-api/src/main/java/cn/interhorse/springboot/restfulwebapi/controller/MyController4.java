package cn.interhorse.springboot.restfulwebapi.controller;

import cn.interhorse.springboot.restfulwebapi.entity.ao.InputAO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 获取入参示例
 *
 * @author InterHorse
 * @date 2020-06-12
 */
@RestController
@RequestMapping(value = "/controller4")
public class MyController4 {
    @RequestMapping(value = "/test1")
    private String test1(HttpServletRequest httpServletRequest) {
        int id = Integer.parseInt(httpServletRequest.getParameter("id"));
        String name = httpServletRequest.getParameter("name");
        return String.format("id:%d, name:%s", id, name);
    }

    @RequestMapping(value = "/test2")
    private String test2(@RequestParam("id") int id,
                         @RequestParam("name") String name) {
        return String.format("id:%d, name:%s", id, name);
    }

    @RequestMapping(value = "/test3/{id}/{name}")
    private String test3(@PathVariable("id") int id,
                         @PathVariable("name") String name) {
        return String.format("id:%d, name:%s", id, name);
    }

    @RequestMapping(value = "/test4")
    private String test4(InputAO inputAO) {
        int id = inputAO.getId();
        String name = inputAO.getName();
        return String.format("id:%d, name:%s", id, name);
    }

    @RequestMapping(value = "/test5")
    private String test5(@RequestParam(value = "id", required = false, defaultValue = "10") int id,
                         @RequestParam(value = "name", required = false, defaultValue = "Bill") String name) {
        return String.format("id:%d, name:%s", id, name);
    }
}
