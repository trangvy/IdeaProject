package com.company;

public class PositiveCheck implements CheckFunction {
    @Override
    public boolean check(Integer num) {
        return num > 0;
    }
}
