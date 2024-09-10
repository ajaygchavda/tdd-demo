package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringAdditionTest {

    @Test
    public void addNumbersWhenNoNumbersGiven(){
        int actualAddition = new StringAddition().add("");
        Assertions.assertEquals(0,actualAddition);
    }

    @Test
    public void addNumbersWhenOneNumberGiven(){
        int actualAddition = new StringAddition().add("1");
        Assertions.assertEquals(1,actualAddition);
    }

    @Test
    public void addNumbersWhenTwoNumbersGiven(){
        int actualAddition = new StringAddition().add("1,2");
        Assertions.assertEquals(3,actualAddition);
    }

    @Test
    public void addNumbersWhenMoreThenTwoNumbersGiven(){
        int actualAddition = new StringAddition().add("1,2,3,4");
        Assertions.assertEquals(10,actualAddition);
    }

    @Test
    public void addNumbersWhenMoreThenTwoNumbersGivenAndDelimiterGetsChanged() {
        int actualAddition = new StringAddition().add("1//@2,3\n4");
        Assertions.assertEquals(10, actualAddition);
    }

    @Test
    public void addNumbersWhenMoreThenTwoNumbersGivenAndDelimiterGetsChangedAndNegativeNumbersGiven() {
        Throwable negativeNumberFormatException = assertThrows(NegativeNumberFormatException.class,
                ()->
                        new StringAddition().add("1//@-2,-3\n-4")
                );
        Assertions.assertEquals(NegativeNumberFormatException.class, negativeNumberFormatException.getClass());
        Assertions.assertEquals("negative numbers not allowed -2", negativeNumberFormatException.getMessage());
    }

    @Test
    public void addNumbersWhenMoreThenTwoNumbersGivenAndMultipleDelimiters() {
        int actualAddition = new StringAddition().add("1//@##$#%%2,3\n4");
        Assertions.assertEquals(10, actualAddition);
    }

    @Test
    public void addNumbersWhenMoreThenTwoNumbersGivenAlongWithMoreThen1000Number() {
        int actualAddition = new StringAddition().add("1//@2,3\n1002");
        Assertions.assertEquals(6, actualAddition);
    }

}
