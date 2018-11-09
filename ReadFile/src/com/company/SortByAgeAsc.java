package com.company;

import java.util.Comparator;

public class SortByAgeAsc implements Comparator<NhanVien> {


    @Override
    public int compare(NhanVien nv1, NhanVien nv2) {
        if (nv1.age > nv2.age ) {
            return 1;
        }else {
            if (nv1.age < nv2.age) return -1;
            else return 0;
        }
    }
}
