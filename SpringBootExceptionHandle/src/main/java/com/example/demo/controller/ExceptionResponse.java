package com.example.demo.controller;

import java.util.Date;

/**
 * ClassName:ExceptionResponse
 * PackageName:com.example.demo.controller
 * Date:2021/1/5 14:29
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
public class ExceptionResponse {
    private Date timestamp;
    private String message;
    private String detail;
    public ExceptionResponse() { }
    public ExceptionResponse(Date timestamp, String message, String detail) {
        this.timestamp = timestamp;
        this.message = message;
        this.detail = detail;
    }
    public Date getTimestamp() {
        return timestamp;
    }
    public String getMessage() {
        return message;
    }
    public String getDetail() {
        return detail;
    }
}
