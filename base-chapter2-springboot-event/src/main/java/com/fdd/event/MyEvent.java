package com.fdd.event;

import org.springframework.context.ApplicationEvent;
/**
 * @Author: jinm feng
 * @Date:07/25/2022 10:19
 * @Description:
 */
public class MyEvent extends ApplicationEvent {
    private String msg;

    public MyEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
