package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class MemoryTest {

    @Test
    public void addMemoryTest(){
    //Given 
    Memory addMem = new Memory();
    double expected = 37;

    //When
    addMem.addInMemory(37);
    double actual = addMem.recallMemory();

    //Then
    Assert.assertEquals(expected, actual,0.001);

    }

    @Test
    public void resetMemoryTest(){
        //Given
        Memory resetMem = new Memory();
        double expected = 0;

        //When
        resetMem.addInMemory(55);
        resetMem.resetMemory();
        double actual = resetMem.recallMemory();

        //Then
        Assert.assertEquals(expected, actual,0.001);
    }

}