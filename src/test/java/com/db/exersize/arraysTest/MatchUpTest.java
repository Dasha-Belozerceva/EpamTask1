package com.db.exersize.arraysTest;

import com.db.exersize.arrays.MatchUp;
import org.junit.Test;

import static org.junit.Assert.*;
import static junit.framework.TestCase.fail;
import static org.hamcrest.MatcherAssert.assertThat;

public class MatchUpTest {

    private MatchUp matchUp = new MatchUp();

    @Test
    public void shouldCountValueOfElementsWithShortDistanceTest() {
        //GIVEN
        int[] arr1 = {6, 5, 8};
        int[] arr2 = {7, 10, 12};

        //WHEN
        int actual = matchUp.matchUp(arr1, arr2);
        int expected = 1;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroIfOneEqualElementInBothArrays() {
        //GIVEN
        int[] arr1 = {2};
        int[] arr2 = {2};

        //WHEN
        int actual = matchUp.matchUp(arr1, arr2);
        int expected = 0;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroIfBothArraysDontHaveElements() {
        //GIVEN
        int[] arr1 = {};
        int[] arr2 = {};

        //WHEN
        int actual = matchUp.matchUp(arr1, arr2);
        int expected = 0;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroIfDifferenceMoreThenTwoOrZero() {
        //GIVEN
        int[] arr1 = {3, 45, 0};
        int[] arr2 = {7, 10, 0};

        //WHEN
        int actual = matchUp.matchUp(arr1, arr2);
        int expected = 0;

        //THEN
        assertEquals(expected, actual);
    }

    @Test (expected = NullPointerException.class)

    public void shouldCheckNullPointerException(){
        //GIVEN
        int[] arr1 = null;
        int[] arr2 = null;

        //WHEN
        int actual = matchUp.matchUp(arr1, arr2);
    }
}