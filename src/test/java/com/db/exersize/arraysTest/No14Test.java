package com.db.exersize.arraysTest;

import com.db.exersize.arrays.No14;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class No14Test {

    No14 no14 = new No14();

    @Test
    public void ShouldCheckIfContainsNo1orNo4Test1() {
        //GIVEN
        int[] arr = {6, 5, 8, 1, 6, 9};

        //WHEN
        Boolean actual = no14.no14(arr);
        Boolean expected = true;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCheckIfContainsNo1orNo4Test2() {
        //GIVEN
        int[] arr = {};

        //WHEN
        Boolean actual = no14.no14(arr);
        Boolean expected = true;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCheckIfContainsNo1orNo4Test3() {
        //GIVEN
        int[] arr = {3, 6, 8};

        //WHEN
        Boolean actual = no14.no14(arr);
        Boolean expected = true;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCheckIfContainsNo1orNo4Test4() {
        //GIVEN
        int[] arr = {5, 8, 4, 6, 4, 7, 1, 5};

        //WHEN
        Boolean actual = no14.no14(arr);
        Boolean expected = false;

        //THEN
        assertEquals(expected, actual);
    }
}