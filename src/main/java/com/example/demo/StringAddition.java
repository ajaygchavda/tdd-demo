package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class StringAddition {
    public int add(String numbers) {
            var numbersList = getExtractedNumbers(numbers);
            var digitsAddition = 0;
            for (String number : numbersList) {
                var digit = Integer.parseInt(number);
                digitsAddition += digit;
            }
            return digitsAddition;
    }

    private List<String> getExtractedNumbers(String numbers){
        var pattern = Pattern.compile("//[/W_]+|\\d+");
        var matcher = pattern.matcher(numbers);
        List<String> numbersArray = new ArrayList<>();
        while(matcher.find()){
            var number = matcher.group();
            numbersArray.add(number);
        }
        return numbersArray;
    }

}
