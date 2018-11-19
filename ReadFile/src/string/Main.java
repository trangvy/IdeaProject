package string;

import com.company.NhanVien;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {

        File file = new File("/home/vytrang/IdeaProjects/ReadFile/src/string/text.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        String name;
        String firstName;
        String lastName;
        int age;
        Date birthday;
        ArrayList<SinhVien> list = new ArrayList<>();

        while ((line = bufferedReader.readLine()) != null){

            String[] item = line.split("\\|");
            name = item[0].trim();
            age = Integer.parseInt(item[1].trim());
            birthday = new SimpleDateFormat("dd/MM/yyyy").parse(item[2].trim());


            lastName = (name.substring(0, name.indexOf(" "))).trim();
            firstName = (name.substring(name.lastIndexOf(" "))).trim();

            SinhVien sinhVien = new SinhVien(name,firstName,lastName,age,birthday);
            list.add(sinhVien);
        }

        ArrayList<SinhVien> listSortByFirstName;
        ArrayList<SinhVien> listSortByLastName;
        ArrayList<SinhVien> listSortByWord;
        String date;
        listSortByFirstName = filterFirtsName("Son",list);


        Comparator<SinhVien> sortbyName = new Comparator<SinhVien>() {


            @Override
            public int compare(SinhVien o1, SinhVien o2) {

                return o1.lastName.compareTo(o2.lastName);
            }
        };

        System.out.println("Danh sach sinh vien ten Son sap xep tang dan theo Ho" + "\n");
        Collections.sort(listSortByFirstName, sortbyName);

        for (SinhVien sinhVien : listSortByFirstName) {
            date = new SimpleDateFormat("dd-MM-yyyy").format(sinhVien.birthday);
            System.out.println(sinhVien.fullName + " | " + sinhVien.age + " | " + date);
        }



        Comparator<SinhVien> sortByFirstName = new Comparator<SinhVien>() {


            @Override
            public int compare(SinhVien o1, SinhVien o2) {

                return o1.firstName.compareTo(o2.firstName);
            }
        };


        listSortByLastName = filterLastName("Nguyen",list);
        Collections.sort(listSortByLastName,sortByFirstName);

        System.out.println("\n Danh sach sinh vien co ho Nguyen sap xep tang dan theo ten");
        for (SinhVien sinhVien : listSortByLastName) {
            date = new SimpleDateFormat("dd-MM-yyyy").format(sinhVien.birthday);
            System.out.println(sinhVien.fullName + " | " + sinhVien.age + " | " + date);
        }

        System.out.println("\n Danh sach sinh vien voi tu khoa " );
        listSortByWord = filterByWord("nguy",list);
        for (SinhVien sinhVien : listSortByWord) {
            System.out.println(sinhVien.fullName);
        }


    }

    public static ArrayList<SinhVien> filterFirtsName(String name, ArrayList<SinhVien> list) {
        ArrayList<SinhVien> newList = new ArrayList<>();

        for (SinhVien item : list) {
            if((item.firstName).equals(name)) {
                newList.add(item);
            }
        }
        return newList;
    }

    public static ArrayList<SinhVien> filterLastName(String name, ArrayList<SinhVien> list) {
        ArrayList<SinhVien> newList = new ArrayList<>();

        for (SinhVien item : list) {
            if((item.lastName).contentEquals(name)) {
                newList.add(item);
            }
        }
        return newList;
    }

    public static ArrayList<SinhVien> filterByWord (String word, ArrayList<SinhVien> list) {
        ArrayList<SinhVien> newlist = new ArrayList<>();

        for (SinhVien item : list) {
            String upperCase = item.fullName.toUpperCase();
            if(upperCase.contains(word.toUpperCase())){
                newlist.add(item);
            }
        }
        return newlist;
    }

}
