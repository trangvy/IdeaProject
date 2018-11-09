package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class NhanVien implements Serializable {
    String name;
    int age;
    Date birthday;

    public NhanVien(String name, int age){
        this.name = name;
        this.age = age;
    }
    public NhanVien(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

}