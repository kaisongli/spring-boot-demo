package com.lks.restfulinterface.entity;

/**
 * Created by likaisong on 2019/5/29.
 */
public class User {
    private long userId;

    private String name;

    private int age;

    public User(long userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }

    public long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
