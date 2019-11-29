package com.db.exersize.arraysTest;

import com.db.exersize.arrays.FizzArray;
import org.junit.Test;
import org.junit.Assert;

public class FizzArrayTest{
    FizzArray fizzArray = new FizzArray();
    @Test
    public void ShouldReturnArrayOfIndexesTest1() {
        //GIVEN
        int n = 4;

        //WHEN
        int[] actual = fizzArray.fizzArray(n);
        int[] expected = {0, 1, 2, 3};

        //THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldReturnArrayOfIndexesTest2() {
        //GIVEN
        int n = 1;

        //WHEN
        int[] actual = fizzArray.fizzArray(n);
        int[] expected = {0};

        //THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldReturnArrayOfIndexesTest3() {
        //GIVEN
        int n = 0;

        //WHEN
        int[] actual = fizzArray.fizzArray(n);
        int[] expected = {};

        //THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldReturnArrayOfIndexesTest4() {
        //GIVEN
        int n = 10;

        //WHEN
        int[] actual = fizzArray.fizzArray(n);
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8 , 9};

        //THEN
        Assert.assertArrayEquals(expected, actual);
    }
}