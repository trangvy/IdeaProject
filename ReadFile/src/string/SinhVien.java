package string;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class SinhVien {
    public String firstName;
    public String lastName;
    public String fullName;
    public int age;
    public Date birthday;

    public SinhVien(String fullName, String firstName, String lastName, int age, Date birthday) {
        this.fullName = fullName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
    }
}
