package cn.interhorse.springboot.mybatisdruidmysql.controller;

import cn.interhorse.springboot.mybatisdruidmysql.dao.mapper.PeopleMapper;
import cn.interhorse.springboot.mybatisdruidmysql.dao.mapper.PeopleXmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author InterHorse
 * @date 2020/6/3
 */
@Controller
public class MyController {
    @Autowired
    private PeopleMapper peopleMapper;
    @Autowired
    private PeopleXmlMapper peopleXmlMapper;

    @ResponseBody
    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    private Object selectAll() {
        return peopleMapper.selectAll();
    }

    @ResponseBody
    @RequestMapping(value = "/selectById/{id}", method = RequestMethod.GET)
    private Object selectById(@PathVariable("id") int id) {
        return peopleMapper.selectById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/xml/selectById/{id}", method = RequestMethod.GET)
    private Object selectByIdXml(@PathVariable("id") int id) {
        return peopleXmlMapper.selectById(id);
    }
}
