package cn.web.spider.scheduler;

import cn.web.spider.Request;
import cn.web.spider.Task;

/**
 * 管理URL队列
 * @author jinhang
 *
 */
public interface Scheduler {

    /**
     * add a url to fetch
     *
     * @param request request
     * @param task task
     */
    public void push(Request request, Task task);

    /**
     * get an url to crawl
     *
     * @param task the task of spider
     * @return the url to crawl
     */
    public Request poll(Task task);

}
