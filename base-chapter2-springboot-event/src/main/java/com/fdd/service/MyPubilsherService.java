package com.fdd.service;

import com.fdd.event.MyEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * @Author: jinm feng
 * @Date:07/25/2022 10:29
 * @Description:
 */
@Service
@Slf4j
public class MyPubilsherService {

    @Autowired
    private ApplicationEventPublisher publisher;

    public void publishEvent(String msg) {
        //开始发布事件：信息是msg
        log.info("will publish msg :"+msg);
        //发布器发布事件
        publisher.publishEvent(new MyEvent(this, msg));
    }

}
