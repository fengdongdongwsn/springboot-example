package com.fdd.bean;

import java.io.Serializable;

/**
 * ClassName:User
 * PackageName:com.fdd.bean
 * Date:2019/12/24 17:38
 * Author:冯冬冬，3049352171@qq.com
 * Description:
 */
public class User implements Serializable {

    private static final long serialVersionUID = 5237730257103305078L;

    private Integer id;
    private String userName;
    private String userSex;

    public User() {
    }

    public User(Integer id, String userName, String userSex) {
        this.id = id;
        this.userName = userName;
        this.userSex = userSex;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserSex() {
        return userSex;
    }
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

}