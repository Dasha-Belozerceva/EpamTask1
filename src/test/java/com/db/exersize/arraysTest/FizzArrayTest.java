package com.db.exersize.arraysTest;

import com.db.exersize.arrays.FizzArray;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class FizzArrayTest{
    private FizzArray fizzArray = new FizzArray();
    @Test
    public void shouldCheckCaseWhenNIsFour() {
        //GIVEN
        int n = 4;

        //WHEN
        int[] actual = fizzArray.fizzArray(n);
        int[] expected = {0, 1, 2, 3};

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCheckCaseWhenNIsOne() {
        //GIVEN
        int n = 1;

        //WHEN
        int[] actual = fizzArray.fizzArray(n);
        int[] expected = {0};

        //THEN
       assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCheckCaseWhenNIsZero() {
        //GIVEN
        int n = 0;

        //WHEN
        int[] actual = fizzArray.fizzArray(n);
        int[] expected = {};

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCheckCaseWhenNIsTen() {
        //GIVEN
        int n = 10;

        //WHEN
        int[] actual = fizzArray.fizzArray(n);
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8 , 9};

        //THEN
        assertArrayEquals(expected, actual);
    }
}