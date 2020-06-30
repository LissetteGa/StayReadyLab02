package com.codedifferently;

public class Memory {

    protected double memoryValue;

    public Memory() {
        memoryValue = 0.0; 
    }

    //store in memory and update display(M+)
    public void addInMemory(double num) {
        memoryValue += SciCalculator.currentValue = num;
    }

    //Resets Memory(MC)
    public void resetMemory() {
        memoryValue = 0.0;
    }

    //Recall the current value from memory to the display (MRC)
    public double recallMemory() {
        return memoryValue;
    }
    
}