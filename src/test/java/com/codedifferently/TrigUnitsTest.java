package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigUnitsTest {

    @Test
    public void switchUnitsTest(){
        //Given
        TrigUnits unit = new TrigUnits();
        String expected = "Radians";
        
        //When
        unit.switchUnitsMode();
        String actual = TrigUnits.getMode();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void switchUnitStringTest(){
        //Given
        TrigUnits unit = new TrigUnits();
        String expected = "Degrees";
        
        //When
        unit.switchUnitsMode("Degrees");
        String actual = TrigUnits.getMode();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUnitsModeTest(){
        //Given
        TrigUnits unit = new TrigUnits();
        String expected = "Degrees";
        
        //When
        unit.getMode();
        String actual = TrigUnits.getMode();

        //Then
        Assert.assertEquals(expected, actual);
    }
    
}