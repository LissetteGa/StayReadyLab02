package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigFunctionTest {

    @Test
    public void sinTest() {
        //Given
        SciCalculator calc = new SciCalculator();
        TrigFunction sin = new TrigFunction();
        double num = 60;
        double expected = Math.sin(60);

        //When
        calc.setCurrentValue(num);
        sin.sin(num);
        double actual = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual,0.001);
    }

    @Test
    public void cosTest() {
        //Given
        SciCalculator calc = new SciCalculator();
        TrigFunction cos = new TrigFunction();
        double num = 60;
        double expected = Math.cos(60);

        //When
        calc.setCurrentValue(num);
        cos.cosin(num);
        double actual = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual,0.001);
    }

    @Test
    public void tanTest() {
        //Given
        SciCalculator calc = new SciCalculator();
        TrigFunction tan = new TrigFunction();
        double num = 60;
        double expected = Math.tan(60);

        //When
        calc.setCurrentValue(num);
        tan.tan(num);
        double actual = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual,0.001);
    }

    @Test
    public void invSinTest() {
        //Given
        SciCalculator calc = new SciCalculator();
        TrigFunction invs = new TrigFunction();
        double num = 60;
        double expected = Math.asin(60);

        //When
        calc.setCurrentValue(num);
        invs.invSin(num);
        double actual = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual,0.001);
    }

    @Test
    public void invCosTest() {
        //Given
        SciCalculator calc = new SciCalculator();
        TrigFunction invc = new TrigFunction();
        double num = 60;
        double expected = Math.acos(60);

        //When
        calc.setCurrentValue(num);
        invc.invCosin(num);
        double actual = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual,0.001);
    }

    @Test
    public void invTanTest() {
        //Given
        SciCalculator calc = new SciCalculator();
        TrigFunction invt = new TrigFunction();
        double num = 60;
        double expected = Math.atan(60);

        //When
        calc.setCurrentValue(num);
        invt.invTan(num);
        double actual = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual,0.001);
    }
    
}