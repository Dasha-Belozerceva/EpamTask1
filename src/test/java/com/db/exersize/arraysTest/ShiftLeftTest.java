package com.db.exersize.arraysTest;

import com.db.exersize.arrays.ShiftLeft;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import static junit.framework.TestCase.fail;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShiftLeftTest {

    private ShiftLeft shiftLeft = new ShiftLeft();

    @Test
    public void shouldReturnArrWithShiftedLeftValuesTest() {
        //GIVEN
        int[] arr = {1, 1, 3, 4, 2};

        //WHEN
        int[] actual = shiftLeft.shiftLeft(arr);
        int[] expected = {1, 3, 4, 2, 1};

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyArrIfGivenIsEmpty() {
        //GIVEN
        int[] arr = {};

        //WHEN
        int[] actual = shiftLeft.shiftLeft(arr);
        int[] expected = {};

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnTheSameArrIfGivenWithTheSameValues() {
        //GIVEN
        int[] arr = {1, 1};

        //WHEN
        int[] actual = shiftLeft.shiftLeft(arr);
        int[] expected = {1, 1};

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReplaceIndexesOfValuesIfLengthIsTwo() {
        //GIVEN
        int[] arr = {34, 879};

        //WHEN
        int[] actual = shiftLeft.shiftLeft(arr);
        int[] expected = {879, 34};

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnTheSameArrIfLengthIsOne() {
        //GIVEN
        int[] arr = {57657};

        //WHEN
        int[] actual = shiftLeft.shiftLeft(arr);
        int[] expected = {57657};

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test (expected = NullPointerException.class)

    public void shouldCheckNullPointerException(){
        //GIVEN
        int[] arr = null;

        //WHEN
        try{
            int[] actual = shiftLeft.shiftLeft(arr);
            fail();
        } catch (NullPointerException e){
            assertThat(e.getMessage(), null);
        }
    }
}