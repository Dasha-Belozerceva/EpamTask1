package com.db.exersize.arraysTest;

import com.db.exersize.arrays.Post4;
import org.junit.Test;
import org.junit.Assert;

public class Post4Test {

    Post4 post4 = new Post4();

    @Test
    public void ShouldReturnArrayAfterLastFourTest1() {
        //GIVEN
        int[] newArr = {4};

        //WHEN
        int[] actual = post4.post4(newArr);
        int[] expected = {};

        //THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldReturnArrayAfterLastFourTest2() {
        //GIVEN
        int[] newArr = {1, 4, 6, 34, 3, 4, 6};

        //WHEN
        int[] actual = post4.post4(newArr);
        int[] expected = {6};

        //THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldReturnArrayAfterLastFourTest3() {
        //GIVEN
        int[] newArr = {1, 4, 4, 2, 2};

        //WHEN
        int[] actual = post4.post4(newArr);
        int[] expected = {2, 2};

        //THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldReturnArrayAfterLastFourTest4() {
        //GIVEN
        int[] newArr = {1, 6, 4, 65, 189, 3};

        //WHEN
        int[] actual = post4.post4(newArr);
        int[] expected = {65, 189, 3};

        //THEN
        Assert.assertArrayEquals(expected, actual);
    }
}