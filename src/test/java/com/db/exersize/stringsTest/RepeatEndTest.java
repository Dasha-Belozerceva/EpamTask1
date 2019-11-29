package com.db.exersize.stringsTest;

import com.db.exersize.strings.RepeatEnd;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatEndTest {

    RepeatEnd repeatEnd = new RepeatEnd();

    @Test
    public void ShouldRepeatEndOfStringTest1() {
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
    public void ShouldRepeatEndOfStringTest2() {
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
    public void ShouldRepeatEndOfStringTest3() {
        //GIVEN
        String str = "";
        int n = 0;

        //WHEN
        String actual = repeatEnd.repeatEnd(str, n);
        String expected = "";

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldRepeatEndOfStringTest4() {
        //GIVEN
        String str = "OldschoolHollywood89";
        int n = 4;

        //WHEN
        String actual = repeatEnd.repeatEnd(str, n);
        String expected = "od89od89od89od89";

        //THEN
        assertEquals(expected, actual);
    }
}