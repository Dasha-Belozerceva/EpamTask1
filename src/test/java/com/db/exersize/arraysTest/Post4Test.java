package com.db.exersize.arraysTest;

import com.db.exersize.arrays.Post4;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import static junit.framework.TestCase.fail;
import static org.hamcrest.MatcherAssert.assertThat;

public class Post4Test {

    private Post4 post4 = new Post4();

    @Test
    public void shouldReturnEmptyArrayIfArrayContainOnlyOneFour() {
        //GIVEN
        int[] newArr = {4};

        //WHEN
        int[] actual = post4.post4(newArr);
        int[] expected = {};

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnLastElementIfLastFourIsBeforeLast() {
        //GIVEN
        int[] newArr = {1, 4, 6, 34, 3, 4, 6};

        //WHEN
        int[] actual = post4.post4(newArr);
        int[] expected = {6};

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyArrIfNoElementsInArray() {
        //GIVEN
        int[] newArr = {};

        //WHEN
        int[] actual = post4.post4(newArr);
        int[] expected = {};

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyIfNoFourInArr() {
        //GIVEN
        int[] newArr = {2, 6, 65, 189, 3};

        //WHEN
        int[] actual = post4.post4(newArr);
        int[] expected = {};

        //THEN
        assertArrayEquals(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void shouldCheckNullPointerExceptionWhenArrayIsNull(){
        //GIVEN
        int[] newArr = null;

        //WHEN
        int[] actual = post4.post4(newArr);
    }
}