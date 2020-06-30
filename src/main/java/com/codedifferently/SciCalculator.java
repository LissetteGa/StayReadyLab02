package com.codedifferently;

/**
 * Hello world!
 *
 */
public class SciCalculator {
    protected static double currentValue;
    protected DisplayMode displayMode;
    protected TrigFunction trigFunction;
    protected Memory memory; 
    protected CoreFeatures coreFeatures;
    protected TrigUnits trigUnits;

    public SciCalculator(){
        currentValue = 0;
        displayMode = new DisplayMode();
        trigFunction = new TrigFunction();
        memory = new Memory();
        coreFeatures = new CoreFeatures();
        trigUnits = new TrigUnits();
    }


    public SciCalculator(double num){
        this();
        currentValue = num;
    }
    public double getCurrentValue() {
        return SciCalculator.currentValue;
    }

    public void setCurrentValue(double num) {
        SciCalculator.currentValue = num;
    }
    
    public void clearCurrentValue() {
        SciCalculator.currentValue = 0;
    }

    public Memory getMemory() {
        return memory;
    }
    
    public CoreFeatures getCoreFeatures() {
        return coreFeatures;
    }

    public TrigFunction getTrigFunctions() {
        return trigFunction;
    }

    public TrigUnits getTrigUnits() {
        return trigUnits;
    }

}
