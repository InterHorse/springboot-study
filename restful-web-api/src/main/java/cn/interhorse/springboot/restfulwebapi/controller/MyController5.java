package cn.interhorse.springboot.restfulwebapi.controller;

import cn.interhorse.springboot.restfulwebapi.entity.bo.ResponseBO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 返回参数示例
 *
 * @author InterHorse
 * @date 2020-06-12
 */
@RestController
@RequestMapping(value = "/controller5")
public class MyController5 {
    @RequestMapping(value = "/test1")
    private ResponseBO test1(@RequestParam("id") int id,
                             @RequestParam("name") String name) {
        ResponseBO res = new ResponseBO();
        res.setCode("200");
        res.setMessage("调用成功");
        Map<String, Object> map = new HashMap<>(2);
        map.put("id", id);
        map.put("name", name);
        res.setData(map);
        return res;
    }

    @RequestMapping(value = "/test2")
    private ResponseBO test2(@RequestParam("id") int id,
                             @RequestParam("name") String name,
                             HttpServletResponse httpServletResponse) {
        ResponseBO res = new ResponseBO();
        res.setCode("200");
        res.setMessage("调用成功");
        Map<String, Object> map = new HashMap<>(2);
        map.put("id", id);
        map.put("name", name);
        res.setData(map);
        httpServletResponse.setStatus(600);
        return res;
    }
}
