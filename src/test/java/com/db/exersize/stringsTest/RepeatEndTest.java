package com.db.exersize.stringsTest;

import com.db.exersize.strings.RepeatEnd;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatEndTest {

    private RepeatEnd repeatEnd = new RepeatEnd();

    @Test
    public void shouldRepeatEndOfStringTest() {
        //GIVEN
        String str = "Bodibodiboo";
        int n = 3;

        //WHEN
        String actual = repeatEnd.repeatEnd(str, n);
        String expected = "boobooboo";

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyStringIfNIsZero() {
        //GIVEN
        String str = "4234";
        int n = 0;

        //WHEN
        String actual = repeatEnd.repeatEnd(str, n);
        String expected = "";

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyStringIfStringIsEmpty() {
        //GIVEN
        String str = "";
        int n = 1;

        //WHEN
        String actual = repeatEnd.repeatEnd(str, n);
        String expected = "";

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyStrIfStringWithLengthLessThenN() {
        //GIVEN
        String str = "Ol";
        int n = 3;

        //WHEN
        String actual = repeatEnd.repeatEnd(str, n);
        String expected = "";

        //THEN
        assertEquals(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void shouldCheckNullPointerExceptionIfStrIsNull(){
        //GIVEN
        String str = null;
        int n = 9;

        //WHEN
        String actual = repeatEnd.repeatEnd(str, n);
    }
}