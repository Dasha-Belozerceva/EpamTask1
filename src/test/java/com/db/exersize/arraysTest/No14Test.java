package com.db.exersize.arraysTest;

import com.db.exersize.arrays.No14;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import static junit.framework.TestCase.fail;
import static org.hamcrest.MatcherAssert.assertThat;

public class No14Test {

    private No14 no14 = new No14();

    @Test
    public void shouldCheckIfTrueWhenOneOneAndNoFour() {
        //GIVEN
        int[] arr = {6, 5, 8, 1, 6, 9};

        //WHEN
        Boolean actual = no14.no14(arr);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void shouldCheckIfTrueWhenArrayIsEmpty() {
        //GIVEN
        int[] arr = {};

        //WHEN
        Boolean actual = no14.no14(arr);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void shouldCheckIfTrueWhenNoOneAndNoFour() {
        //GIVEN
        int[] arr = {3, 6, 8};

        //WHEN
        Boolean actual = no14.no14(arr);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void shouldCheckIfFalseWhenExistFourAndOne() {
        //GIVEN
        int[] arr = {5, 8, 4, 6, 4, 7, 1, 5};

        //WHEN
        Boolean actual = no14.no14(arr);
        //THEN
        assertTrue(!actual);
    }

    @Test (expected = NullPointerException.class)
    public void shouldCheckNullPointerExceptionWhenGivenArrayIsNull(){
        //GIVEN
        int[] arr = null;

        //WHEN
       boolean actual = no14.no14(arr);
    }
}