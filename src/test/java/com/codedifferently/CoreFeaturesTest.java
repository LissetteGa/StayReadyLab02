package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class CoreFeaturesTest {
    
    @Test
    public void addTest() {
        //Given
        SciCalculator calc = new SciCalculator();
        CoreFeatures add = new CoreFeatures();
        double num = 50;
        double expected = 60;

        //When
        calc.setCurrentValue(num);
        add.add(10);
        double actual = calc.getCurrentValue();

        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void subtractTest() {
        //Given
        SciCalculator subT = new SciCalculator();
        CoreFeatures core = new CoreFeatures();
        double num = 50;
        double expected = 40;

        // When
        subT.setCurrentValue(num);
        core.subtract(10);
        double actual = subT.getCurrentValue();

        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }
    
    @Test
    public void multiplyTest() {
        //Given
        SciCalculator multT = new SciCalculator();
        CoreFeatures core = new CoreFeatures();
        double num = 50;
        double expected = 500;

        // When
        multT.setCurrentValue(num);
        core.multiply(10);
        double actual = multT.getCurrentValue();

        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void divideTest() {
        //Given
        SciCalculator divT = new SciCalculator();
        CoreFeatures core = new CoreFeatures();
        double num = 50;
        double expected = 5;

        // When
        divT.setCurrentValue(num);
        core.divide(10);
        double actual = divT.getCurrentValue();

        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void squareTest() {
        //Given
        SciCalculator squareT = new SciCalculator();
        CoreFeatures core = new CoreFeatures();
        double num = 9;
        double expected = 81;

        // When
        squareT.setCurrentValue(num);
        core.square(num);
        double actual = squareT.getCurrentValue();

        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void sqrootTest() {
        //Given
        SciCalculator sqrT = new SciCalculator();
        CoreFeatures core = new CoreFeatures();
        double num = 9;
        double expected = 3;

        // When
        sqrT.setCurrentValue(num);
        core.squareRoot(num);
        double actual = sqrT.getCurrentValue();

        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void exponentTest() {
        //Given
        SciCalculator expT = new SciCalculator();
        CoreFeatures core = new CoreFeatures();
        double num = 3;
        double expected = 81;

        // When
        expT.setCurrentValue(num);
        core.exponent(4);
        double actual = expT.getCurrentValue();

        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void inverseTest() {
        //Given
        SciCalculator invT = new SciCalculator();
        CoreFeatures core = new CoreFeatures();
        double num = .5;
        double expected = 2;

        // When
        invT.setCurrentValue(num);
        core.inverse(num);
        double actual = invT.getCurrentValue();

        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void switchSignTest() {
        //Given
        SciCalculator switchT = new SciCalculator();
        CoreFeatures core = new CoreFeatures();
        double num = 50;
        double expected = -50;

        // When
        switchT.setCurrentValue(num);
        core.switchSign(num);
        double actual = switchT.getCurrentValue();

        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void absoluteValueTest() {
        //Given
        SciCalculator absT = new SciCalculator();
        CoreFeatures core = new CoreFeatures();
        double num = -50;
        double expected = 50;

        // When
        absT.setCurrentValue(num);
        core.absoluteValue(num);
        double actual = absT.getCurrentValue();

        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void cubeRoot() {
        //Given
        SciCalculator cubeT = new SciCalculator();
        CoreFeatures core = new CoreFeatures();
        double num = 8;
        double expected = 2;

        // When
        cubeT.setCurrentValue(num);
        core.cubeRoot(num);
        double actual = cubeT.getCurrentValue();

        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }

}