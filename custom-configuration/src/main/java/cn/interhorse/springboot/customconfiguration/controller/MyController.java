package cn.interhorse.springboot.customconfiguration.controller;

import cn.interhorse.springboot.customconfiguration.entity.MyConfigProp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author InterHorse
 * @date 2020-06-27
 */
@Controller
public class MyController {
    private static final Logger LOG = LoggerFactory.getLogger(MyController.class);

    @Autowired
    private MyConfigProp myConfigProp;

    @Value("${myconfig.name}")
    private String name;

    @ResponseBody
    @RequestMapping(value = "/test1")
    private void test1() {
        LOG.info("name:{}", name);
    }

    @ResponseBody
    @RequestMapping(value = "/test2")
    private void test2() {
        List<String> friends = myConfigProp.getFriends();

        LOG.info("name:{}, city:{}, age:{}",
                myConfigProp.getName(), myConfigProp.getCity(), myConfigProp.getAge());
        for (String n : friends) {
            LOG.info("friend name:{}", n);
        }
    }
}
