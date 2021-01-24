package com.example.demo.dao;

/**
 * ClassName:User
 * PackageName:com.example.demo
 * Date:2021/1/5 11:44
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
public class User {
    private int id;
    private String name;
    public User() {
    }
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
