package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class SciCalculatorTest {
    
    @Test
    public void getCurrentValueTest(){
        //Given
        SciCalculator calculator = new SciCalculator(6);
        double expected = 2;

        //When 
        calculator.setCurrentValue(2);
        double actual = calculator.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual,0.001);
    }

    @Test
    public void clearCurrentValueTest(){
        //Given
        SciCalculator clear = new SciCalculator(10);
        double expected = 0;

        //When
        clear.clearCurrentValue();
        double actual = clear.getCurrentValue();

        //Then
        Assert.assertEquals(expected,actual,0.001);
    }

    @Test
    public void getMemoryTest(){
        //Given
        Memory memory = new Memory();
        double expected = 0;

        //When
        double actual = memory.recallMemory();

        //Then
        Assert.assertEquals(expected, actual,0.001);

    }

}
