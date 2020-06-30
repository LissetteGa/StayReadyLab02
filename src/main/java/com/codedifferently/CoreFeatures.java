package com.codedifferently;

public class CoreFeatures {

    //Addition Method
    public double add(double num) {
        return SciCalculator.currentValue = num + SciCalculator.currentValue;
    }
    
    //Subtraction Method 
    public double subtract(double num) {
        return SciCalculator.currentValue  = SciCalculator.currentValue - num;
    }

    //Multiplication Method
    public double multiply(double num) {
        return SciCalculator.currentValue = num * SciCalculator.currentValue;
    }

    //Division Method
    public double divide(double num) {
        if (num == 0) {
            System.out.println("Error");
            return 0; 
        } else {
            return SciCalculator.currentValue = SciCalculator.currentValue / num;
        }
    }

    //Square(x^2) Method
    public double square(double currentValue) {
        return SciCalculator.currentValue = SciCalculator.currentValue * SciCalculator.currentValue; 
    }

    //Square root(√x) Method
    public double squareRoot(double currentValue) {
        return SciCalculator.currentValue = Math.sqrt(SciCalculator.currentValue);
    }

    //Exponents Method 
    public double exponent(double num) {
        return SciCalculator.currentValue = Math.pow(SciCalculator.currentValue, num);
    }

    //Inverse Method
    public double inverse(double currentValue) {
        return SciCalculator.currentValue = 1/ SciCalculator.currentValue;
    }

    //Inverting signs Method
    public double switchSign(double currentValue) {
        return SciCalculator.currentValue = -1 * SciCalculator.currentValue;
    }

    //Absolute Value Method of currentnumber
    public double absoluteValue(double currentValue) {
        return SciCalculator.currentValue = Math.abs(SciCalculator.currentValue);
    }

    //Cubed root Value Method of current number
    public double cubeRoot(double currentValue) {
        return SciCalculator.currentValue = Math.cbrt(SciCalculator.currentValue);
    }

}