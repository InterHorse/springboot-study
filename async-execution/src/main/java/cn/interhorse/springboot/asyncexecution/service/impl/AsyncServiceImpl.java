package cn.interhorse.springboot.asyncexecution.service.impl;

import cn.interhorse.springboot.asyncexecution.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 异步方法
 *
 * @author InterHorse
 * @date 2020-06-22
 */
@Service
public class AsyncServiceImpl implements AsyncService {
    private static final Logger LOG = LoggerFactory.getLogger(AsyncServiceImpl.class);

    @Async
    @Override
    public void printLog1() {
        LOG.info("printLog1 开始执行 -> Thread name is: {}", Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOG.info("printLog1 执行完毕 -> Thread name is: {}", Thread.currentThread().getName());
    }

    @Async("myExecutor")
    @Override
    public void printLog2() {
        LOG.info("printLog2 开始执行 -> Thread name is: {}", Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOG.info("printLog2 执行完毕 -> Thread name is: {}", Thread.currentThread().getName());
    }
}
