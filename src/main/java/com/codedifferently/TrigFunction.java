package com.codedifferently;

public class TrigFunction {

    //Sin
    public double sin(double currentValue) {
        return SciCalculator.currentValue = Math.sin(SciCalculator.currentValue);
    }

    //Cosin
    public double cosin(double currentValue) {
        return SciCalculator.currentValue = Math.cos(SciCalculator.currentValue);
    }
    
    //Tan
    public double tan(double currentValue) {
        return SciCalculator.currentValue = Math.tan(SciCalculator.currentValue);
    }

    //Inverse Sin
    public double invSin(double currentValue) {
        return SciCalculator.currentValue = Math.asin(SciCalculator.currentValue);
    }

    //Inverse Cosin
    public double invCosin(double currentValue) {
        return SciCalculator.currentValue = Math.acos(SciCalculator.currentValue);
    }

    //Inverse Tan 
    public double invTan(double currentValue) {
        return SciCalculator.currentValue = Math.atan(SciCalculator.currentValue);
    }
}