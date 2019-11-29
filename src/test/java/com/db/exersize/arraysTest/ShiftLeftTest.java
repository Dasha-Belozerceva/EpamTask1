package com.db.exersize.arraysTest;

import com.db.exersize.arrays.ShiftLeft;
import org.junit.Test;
import org.junit.Assert;

public class ShiftLeftTest {

    ShiftLeft shiftLeft = new ShiftLeft();

    @Test
    public void ShouldReturnArrWithShiftedLeftValuesTest1() {
        //GIVEN
        int[] arr = {1, 1, 3, 4, 2};

        //WHEN
        int[] actual = shiftLeft.shiftLeft(arr);
        int[] expected = {1, 3, 4, 2, 1};

        //THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldReturnArrWithShiftedLeftValuesTest2() {
        //GIVEN
        int[] arr = {};

        //WHEN
        int[] actual = shiftLeft.shiftLeft(arr);
        int[] expected = {};

        //THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldReturnArrWithShiftedLeftValuesTest3() {
        //GIVEN
        int[] arr = {1, 1};

        //WHEN
        int[] actual = shiftLeft.shiftLeft(arr);
        int[] expected = {1, 1};

        //THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldReturnArrWithShiftedLeftValuesTest4() {
        //GIVEN
        int[] arr = {34, 879};

        //WHEN
        int[] actual = shiftLeft.shiftLeft(arr);
        int[] expected = {879, 34};

        //THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldReturnArrWithShiftedLeftValuesTest5() {
        //GIVEN
        int[] arr = {57657};

        //WHEN
        int[] actual = shiftLeft.shiftLeft(arr);
        int[] expected = {57657};

        //THEN
        Assert.assertArrayEquals(expected, actual);
    }
}