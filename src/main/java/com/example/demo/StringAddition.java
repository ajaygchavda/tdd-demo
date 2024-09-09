package com.example.demo;

import org.springframework.util.StringUtils;

import java.util.Objects;

public class StringAddition {
    public int add(String numbers ) {
        if (Objects.isNull(numbers) || numbers.isEmpty()) {
            return 0;
        } else {
            if(!numbers.contains(",")){
                return Integer.parseInt(numbers);
            }
            var numbersList = numbers.split(",");
            int digitsAddition = 0;
            for (String number : numbersList) {
                var digit = Integer.parseInt(number);
                digitsAddition += digit;
            }
            return digitsAddition;
        }
    }
}
