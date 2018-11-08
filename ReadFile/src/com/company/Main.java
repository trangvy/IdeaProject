package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("/home/vytrang/IdeaProjects/IdeaProject/ReadFile/src/com/company/text.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        ArrayList<NhanVien> listNv = new ArrayList<>();

        String name;
        int age;
        int i = 0;

        while ((line = bufferedReader.readLine()) != null) {
            i++;
            String[] art = line.split("\\|");
            name = art[0];
            age = Integer.parseInt(art[1]);
            NhanVien nhanVien = new NhanVien(name, age);
            listNv.add(nhanVien);
        }

        System.out.println("Danh sach nhan vien");
        for (NhanVien nhanVien : listNv) {
            System.out.println(nhanVien.name + "| " + nhanVien.age);
        }
    }
}
