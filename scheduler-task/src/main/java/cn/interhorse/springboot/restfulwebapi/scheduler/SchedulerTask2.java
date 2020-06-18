package cn.interhorse.springboot.restfulwebapi.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务
 *
 * @author InterHorse
 * @date 2020-06-17
 */
@Component
public class SchedulerTask2 {
    private static final Logger LOG = LoggerFactory.getLogger(SchedulerTask2.class);

    /**
     * 每秒执行一次
     */
    @Async
    @Scheduled(cron = "* * * * * ?")
    public void scheduler1() {
        LOG.info("SchedulerTask2 scheduler1 执行: " + System.currentTimeMillis());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOG.info("SchedulerTask2 scheduler1 执行完了: " + System.currentTimeMillis());
    }
}
