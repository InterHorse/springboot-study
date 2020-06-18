package cn.interhorse.springboot.restfulwebapi.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务
 *
 * @author InterHorse
 * @date 2020-06-17
 */
@Component
public class SchedulerTask1 {
    private static final Logger LOG = LoggerFactory.getLogger(SchedulerTask1.class);

    /**
     * 每秒执行一次
     */
    @Scheduled(cron = "* * * * * ?")
    public void scheduler1() {
        LOG.info("SchedulerTask1 scheduler1 执行: " + System.currentTimeMillis());
    }

    /**
     * 每五秒执行一次
     */
    @Scheduled(cron = "*/5 * * * * ?")
    public void scheduler2() {
        LOG.info("SchedulerTask1  执行: " + System.currentTimeMillis());
    }

    /**
     * 任务执行结束后，每隔 2 秒执行一次
     */
    @Scheduled(fixedDelay = 2000)
    public void scheduler3() {
        LOG.info("SchedulerTask1 scheduler3 执行: " + System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 任务执行开始后，2 秒再执行一次
     */
    @Scheduled(fixedRate = 2000)
    public void scheduler4() {
        LOG.info("SchedulerTask1 scheduler4 执行: " + System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 任务首次延迟 3 秒开始，每 2 秒执行一次
     */
    @Scheduled(initialDelay = 3000, fixedRate = 2000)
    public void scheduler5() {
        LOG.info("SchedulerTask1 scheduler5 执行: " + System.currentTimeMillis());
    }
}
