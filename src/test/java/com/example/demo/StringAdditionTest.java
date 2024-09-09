package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
