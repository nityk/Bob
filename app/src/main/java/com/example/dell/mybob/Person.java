package com.example.dell.mybob;

import cn.bmob.v3.BmobObject;

/**
 * Created by dell on 2016/10/31.
 */
public class Person extends BmobObject {
    private String name;
    private String address;
    private int age;
    private String Decs;


    public String getDecs() {
        return Decs;
    }

    public void setDecs(String decs) {
        Decs = decs;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
