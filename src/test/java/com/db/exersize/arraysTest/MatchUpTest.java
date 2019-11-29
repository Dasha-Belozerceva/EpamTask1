package com.db.exersize.arraysTest;

import com.db.exersize.arrays.MatchUp;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatchUpTest {

    MatchUp matchUp = new MatchUp();

    @Test
    public void ShouldCountValueOfElementsWithShortDistanceTest1() {
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
    public void ShouldCountValueOfElementsWithShortDistanceTest2() {
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
    public void ShouldCountValueOfElementsWithShortDistanceTest3() {
        //GIVEN
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 3};

        //WHEN
        int actual = matchUp.matchUp(arr1, arr2);
        int expected = 2;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCountValueOfElementsWithShortDistanceTest4() {
        //GIVEN
        int[] arr1 = {6, 45, 0};
        int[] arr2 = {7, 10, 0};

        //WHEN
        int actual = matchUp.matchUp(arr1, arr2);
        int expected = 1;

        //THEN
        assertEquals(expected, actual);
    }
}