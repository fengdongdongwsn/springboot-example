package com.fdd.listener;

import com.fdd.event.MyEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * @Author: jinm feng
 * @ModuleOwner: will chen
 * @Date:07/25/2022 10:37
 * @Description:
 */

@Service
@Slf4j
public class MyListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info("监听到消息：{}", event.getMsg());
        //下面开始处理具体的业务
    }
}
