package com.example.demo;

import java.util.ArrayList;
import java.util.List;
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
        var pattern = Pattern.compile("//[/W_]+|-\\d|\\d+");
        var matcher = pattern.matcher(numbers);
        List<String> numbersArray = new ArrayList<>();
        while(matcher.find()){
            var number = matcher.group();
            checkIfNegativeNumber(number);
            numbersArray.add(number);
        }
        return numbersArray;
    }

    private static void checkIfNegativeNumber(String number) {
        if(Integer.signum(Integer.parseInt(number)) == -1){
            throw new NegativeNumberFormatException("negative numbers not allowed "+number);
        }
    }


}
