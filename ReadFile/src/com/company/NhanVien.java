package com.company;

import java.io.Serializable;

public class NhanVien implements Serializable {
    String name;
    int age;

    public NhanVien(String name, int age){
        this.name = name;
        this.age = age;
    }
}