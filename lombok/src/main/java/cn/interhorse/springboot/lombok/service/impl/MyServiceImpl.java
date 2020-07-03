package cn.interhorse.springboot.lombok.service.impl;

import cn.interhorse.springboot.lombok.service.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author InterHorse
 * @date 2020-07-03
 */
@Slf4j
@Service
public class MyServiceImpl implements MyService {
    @Override
    public void test() {
        log.info("使用 @Slf4j 输出日志");
    }
}
