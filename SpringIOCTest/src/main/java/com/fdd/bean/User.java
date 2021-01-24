package com.fdd.bean;

/**
 * ClassName:User
 * PackageName:com.fdd.bean
 * Date:2020/1/6 10:00
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
public class User {

    private Car car;

    public User(Car car) {
        this.car = car;
    }

    public void goSchool(){
        car.start();
        car.turn();
        System.out.println("到达学校");
        car.stop();
    }

    public void goHome(){
        car.start();
        car.turn();
        System.out.println("到家了");
        car.stop();
    }

}
