package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringAdditionTest {

    @Test
    public void addNumbersWhenNoNumbersGiven(){
        int actualAddition = new StringAddition().add("");
        Assertions.assertEquals(0,actualAddition);
    }
}
