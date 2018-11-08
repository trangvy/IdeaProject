package com.company;

public class OddCheck implements CheckFunction {
    public boolean check(Integer num) {
        return num % 2 != 0;
    }

}
