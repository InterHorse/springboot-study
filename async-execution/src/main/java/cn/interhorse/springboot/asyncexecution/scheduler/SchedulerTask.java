package cn.interhorse.springboot.asyncexecution.scheduler;

import cn.interhorse.springboot.asyncexecution.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务
 *
 * @author InterHorse
 * @date 2020-06-22
 */
@Component
public class SchedulerTask {
    private static final Logger LOG = LoggerFactory.getLogger(SchedulerTask.class);

    @Autowired
    private AsyncService asyncService;

    /**
     * 每 5 秒执行一次
     *
     */
    @Scheduled(cron = "*/5 * * * * ?")
    public void scheduler1() {
        LOG.info("scheduler1 开始执行");
        asyncService.printLog1();
        LOG.info("scheduler1 执行完毕");
    }

    /**
     * 每 5 秒执行一次
     */
    @Scheduled(cron = "*/5 * * * * ?")
    public void scheduler2() {
        LOG.info("scheduler2 开始执行");
        asyncService.printLog2();
        LOG.info("scheduler2 执行完毕");
    }
}
