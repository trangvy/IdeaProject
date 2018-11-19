package json2;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws FileNotFoundException {

        Gson gson = new Gson();
        BufferedReader br = null;
        br = new BufferedReader(new FileReader("/home/vytrang/IdeaProjects/IdeaProject/ReadFile/src/json2/text.txt"));
        Result result = gson.fromJson(br,Result.class);

        int indexOf = -1;
        int indexOf2 = -1;

        for (SinhVien sv : result.getTodos()) {
            if(sv.name.trim().equals("Vy Trang")) {
                indexOf = (result.getTodos()).indexOf(sv);
                break;
            }
        }
        System.out.println("chi so trong Array List cua sinh vien co cua phan tu dau tien co ten Vy Trang: " + indexOf);


        for (SinhVien sinhVien : result.getTodos()) {
            String firtsName = sinhVien.name.substring(0,sinhVien.name.indexOf(" "));
            String lastName = sinhVien.name.substring(sinhVien.name.lastIndexOf(" "));
            if ( firtsName.toLowerCase().trim().indexOf("ng") == 0
            || lastName.toLowerCase().trim().indexOf("ng") == 0 ) {
                indexOf2 = (result.getTodos()).indexOf(sinhVien);
                break;
            }
        }
        System.out.println("chi so trong Array List cua sinh vien co ho hoac ten bat dau bang ng: " + indexOf2);


        /*Bai 2*/

        BufferedReader br2 = null;
        br2 = new BufferedReader(new FileReader("/home/vytrang/IdeaProjects/IdeaProject/ReadFile/src/json2/text2.txt"));
        Result result2 = gson.fromJson(br2,Result.class);

        ArrayList<SinhVien> list1 = new ArrayList<>();
        ArrayList<SinhVien> list2 = new ArrayList<>();
        for (SinhVien s : result.getTodos()) {
            list1.add(s);
        }
        for (SinhVien sinhVien : result2.getTodos()) {
            list2.add(sinhVien);
        }

//        list1.addAll(0,list2);
//        list1.addAll(list2);


        int indexOf3 = 0;
        for (SinhVien sv : result.getTodos()) {
            if(sv.name.trim().equals("Bui Thanh Nguyen")) {
                indexOf3 = (result.getTodos()).indexOf(sv);
                break;
            }
        }

        list1.addAll(indexOf3,list2);

        for (SinhVien sinhVien : list1) {
            System.out.println(sinhVien.name);
        }

    }
}
