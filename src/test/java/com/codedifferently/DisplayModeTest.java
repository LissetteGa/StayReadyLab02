package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class DisplayModeTest {

    @Test
    public void switchDisplayModeTest() {
        // Given
        DisplayMode display = new DisplayMode();
        DisplayMode.whichMode = "Decimal";
        String expected = "Hexadecimal";
        
        // When
        display.switchDisplayMode();
        String actual = DisplayMode.getMode();
        
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void switchUnitStringTest(){
        //Given
        DisplayMode unit = new DisplayMode();
        String expected = "Octal";
        
        //When
        unit.switchUnitsMode("Octal");
        String actual = DisplayMode.getMode();

        //Then
        Assert.assertEquals(expected, actual);
    }
}