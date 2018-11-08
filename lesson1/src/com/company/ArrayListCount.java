package com.company;

import java.util.ArrayList;

public class ArrayListCount {
    public int count(ArrayList<Integer> nums, CheckFunction someObject) {
        int count = 0;
        for (Integer num : nums) {
            if (someObject.check(num)) {
                count++;
            }
        }
        return count;
    }
}
