package cn.interhorse.springboot.asyncexecution.service;

/**
 * @author InterHorse
 * @date 2020-06-22
 */
public interface AsyncService {
    /**
     * 使用默认异步线程执行
     */
    void printLog1();

    /**
     * 使用自定义线程池执行
     */
    void printLog2();
}
