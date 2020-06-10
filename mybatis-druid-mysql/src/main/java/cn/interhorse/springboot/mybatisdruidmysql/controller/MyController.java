package cn.interhorse.springboot.mybatisdruidmysql.controller;

import cn.interhorse.springboot.mybatisdruidmysql.dao.mapper.PeopleMapper;
import cn.interhorse.springboot.mybatisdruidmysql.dao.mapper.PeopleXmlMapper;
import cn.interhorse.springboot.mybatisdruidmysql.entity.People;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author InterHorse
 * @date 2020-06-03
 */
@Controller
public class MyController {
    @Resource
    private PeopleMapper peopleMapper;
    @Resource
    private PeopleXmlMapper peopleXmlMapper;

    /**
     * 查询全部数据
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    private Object selectAll() {
        return peopleMapper.selectAll();
    }

    /**
     * 根据 id 查询
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/selectById/{id}", method = RequestMethod.GET)
    private Object selectById(@PathVariable("id") int id) {
        return peopleMapper.selectById(id);
    }

    /**
     * 插入数据
     * @param httpServletRequest
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    private Object insert(HttpServletRequest httpServletRequest) {
        String name = httpServletRequest.getParameter("name");
        int age = Integer.parseInt(httpServletRequest.getParameter("age"));
        People people = new People(name, age);
        return peopleMapper.insert(people);
    }

    /**
     * 更新数据
     * @param httpServletRequest
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateById", method = RequestMethod.GET)
    private Object updateById(HttpServletRequest httpServletRequest) {
        String name = httpServletRequest.getParameter("name");
        int id = Integer.parseInt(httpServletRequest.getParameter("id"));
        int age = Integer.parseInt(httpServletRequest.getParameter("age"));
        People people = new People(id, name, age);
        return peopleMapper.updateById(people);
    }

    /**
     * 根据 id 删除
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteById/{id}", method = RequestMethod.GET)
    private Object deleteById(@PathVariable("id") int id) {
        return peopleMapper.deleteById(id);
    }

    /**
     * 根据 id 查询 - xml 方式
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/xml/selectById/{id}", method = RequestMethod.GET)
    private Object selectByIdXml(@PathVariable("id") int id) {
        return peopleXmlMapper.selectById(id);
    }

    /**
     * 插入数据 - xml 方式
     * @param httpServletRequest
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/xml/insert", method = RequestMethod.GET)
    private Object insertXml(HttpServletRequest httpServletRequest) {
        String name = httpServletRequest.getParameter("name");
        int age = Integer.parseInt(httpServletRequest.getParameter("age"));
        People people = new People(name, age);
        return peopleXmlMapper.insert(people);
    }

    /**
     * 更新数据 - xml 方式
     * @param httpServletRequest
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/xml/updateById", method = RequestMethod.GET)
    private Object updateByIdXml(HttpServletRequest httpServletRequest) {
        String name = httpServletRequest.getParameter("name");
        int id = Integer.parseInt(httpServletRequest.getParameter("id"));
        int age = Integer.parseInt(httpServletRequest.getParameter("age"));
        People people = new People(id, name, age);
        return peopleXmlMapper.updateById(people);
    }

    /**
     * 根据 id 删除 - xml 方式
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/xml/deleteById/{id}", method = RequestMethod.GET)
    private Object deleteByIdXml(@PathVariable("id") int id) {
        return peopleXmlMapper.deleteById(id);
    }
}
