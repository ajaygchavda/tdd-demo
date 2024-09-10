package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StringAddition {
    public int add(String numbers) {
            var numbersList = getExtractedNumbers(numbers);
            var digitsAddition = 0;
            for (int number : numbersList) {
                digitsAddition += number;
            }
            return digitsAddition;
    }

    private List<Integer> getExtractedNumbers(String numbers){
        var pattern = Pattern.compile("//[/W_]+|-\\d|\\d+");
        var matcher = pattern.matcher(numbers);
        List<Integer> numbersArray = new ArrayList<>();
        while(matcher.find()){
            var number = Integer.parseInt(matcher.group());
            checkIfNegativeNumber(number);
            if(number<=1000) {
                numbersArray.add(number);
            }
        }
        return numbersArray;
    }

    private static void checkIfNegativeNumber(int number) {
        if(Integer.signum(number) == -1){
            throw new NegativeNumberFormatException("negative numbers not allowed "+number);
        }
    }


}
