package com.fdd.bean;

/**
 * ClassName:Benz
 * PackageName:com.fdd.bean
 * Date:2020/1/6 10:04
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
public class Benz  implements Car{
    @Override
    public void start() {
        System.out.println("奔驰车启动了");
    }

    @Override
    public void turn() {
        System.out.println("奔驰车转弯了");
    }

    @Override
    public void stop() {
        System.out.println("奔驰车刹车了");
    }
}
