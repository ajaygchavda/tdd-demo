package com.example.demo;

import org.springframework.util.StringUtils;

public class StringAddition {
    public int add(String numbers ) {
        if (numbers.isEmpty()) {
            return 0;
        } else {
            if(!numbers.contains(",")){
                return Integer.parseInt(numbers);
            }
            return 0;
        }
    }
}
