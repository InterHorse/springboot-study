package cn.interhorse.springboot.mybatisdruidmysql.controller;

import cn.interhorse.springboot.mybatisdruidmysql.dao.mapper.PeopleMapper;
import cn.interhorse.springboot.mybatisdruidmysql.dao.mapper.PeopleXmlMapper;
import cn.interhorse.springboot.mybatisdruidmysql.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

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
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    private Object insert(HttpServletRequest httpServletRequest) {
        String name = httpServletRequest.getParameter("name");
        int age = Integer.parseInt(httpServletRequest.getParameter("age"));
        People people = new People(name, age);
        return peopleMapper.insert(people);
    }

    @ResponseBody
    @RequestMapping(value = "/updateById", method = RequestMethod.GET)
    private Object updateById(HttpServletRequest httpServletRequest) {
        String name = httpServletRequest.getParameter("name");
        int id = Integer.parseInt(httpServletRequest.getParameter("id"));
        int age = Integer.parseInt(httpServletRequest.getParameter("age"));
        People people = new People(id, name, age);
        return peopleMapper.updateById(people);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteById/{id}", method = RequestMethod.GET)
    private Object deleteById(@PathVariable("id") int id) {
        return peopleMapper.deleteById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/xml/selectById/{id}", method = RequestMethod.GET)
    private Object selectByIdXml(@PathVariable("id") int id) {
        return peopleXmlMapper.selectById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/xml/insert", method = RequestMethod.GET)
    private Object insertXml(HttpServletRequest httpServletRequest) {
        String name = httpServletRequest.getParameter("name");
        int age = Integer.parseInt(httpServletRequest.getParameter("age"));
        People people = new People(name, age);
        return peopleXmlMapper.insert(people);
    }

    @ResponseBody
    @RequestMapping(value = "/xml/updateById", method = RequestMethod.GET)
    private Object updateByIdXml(HttpServletRequest httpServletRequest) {
        String name = httpServletRequest.getParameter("name");
        int id = Integer.parseInt(httpServletRequest.getParameter("id"));
        int age = Integer.parseInt(httpServletRequest.getParameter("age"));
        People people = new People(id, name, age);
        return peopleXmlMapper.updateById(people);
    }

    @ResponseBody
    @RequestMapping(value = "/xml/deleteById/{id}", method = RequestMethod.GET)
    private Object deleteByIdXml(@PathVariable("id") int id) {
        return peopleXmlMapper.deleteById(id);
    }
}
