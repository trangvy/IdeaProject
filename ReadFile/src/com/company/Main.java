package com.company;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        File file = new File("/home/vytrang/IdeaProjects/ReadFile/src/com/company/text.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        ArrayList<NhanVien> listNv = new ArrayList<>();

        String name;
        int age;
        Date birthday;
        String date;

        while ((line = bufferedReader.readLine()) != null) {
            String[] parts = line.split("\\|");
            name = parts[0].trim();
            age = Integer.parseInt(parts[1].trim());
            birthday = new SimpleDateFormat("dd/MM/yyyy").parse(parts[2].trim());
            NhanVien nhanVien = new NhanVien(name, age, birthday);
            listNv.add(nhanVien);
        }

        /* chuyen doi while sang for*/
        /*for (String l = bufferedReader.readLine(); l != null; l = bufferedReader.readLine()) {
            System.out.println("line : " + l);
        }*/


        System.out.println("Danh sach nhan vien");
        for (NhanVien nhanVien : listNv) {
            date = new SimpleDateFormat("dd-MM-yyyy").format(nhanVien.birthday);
//            System.out.println(nhanVien.name + " | " + nhanVien.age + " | " + date  );
        }

        Collections.sort(listNv,new SortByAgeAsc());



        /* Anonymous class*/
        Comparator<NhanVien> sortByAgeDesc = new Comparator<NhanVien>() {


            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                if (nv1.age < nv2.age ) {
                    return 1;
                }else {
                    if (nv1.age > nv2.age) return -1;
                    else return 0;
                }
            }
        };

        Collections.sort(listNv,sortByAgeDesc);

        Collections.sort(listNv, new SortByName());
        for (NhanVien nhanVien : listNv) {
            date = new SimpleDateFormat("dd-MM-yyyy").format(nhanVien.birthday);
            System.out.println(nhanVien.name + " | " + nhanVien.age + " | " + date  );
        }
    }

    /*Inner class*/
    static class SortByName implements Comparator<NhanVien>{

        @Override
        public int compare(NhanVien o1, NhanVien o2) {
            return o2.name.compareTo(o1.name);
        }
    }
}
