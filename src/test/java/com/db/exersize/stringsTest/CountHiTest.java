package com.db.exersize.stringsTest;

import com.db.exersize.strings.CountHi;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountHiTest {
    CountHi countHi = new CountHi();

    @Test
    public void ShouldCountHiInTheStringTest1() {
        //GIVEN
        String str = "";

        //WHEN
        int actual = countHi.countHi(str);
        int expected = 0;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCountHiInTheStringTest2() {
        //GIVEN
        String str = "HiHIhi";

        //WHEN
        int actual = countHi.countHi(str);
        int expected = 1;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCountHiInTheStringTest3() {
        //GIVEN
        String str = "HI! there Hi";

        //WHEN
        int actual = countHi.countHi(str);
        int expected = 0;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCountHiInTheStringTest4() {
        //GIVEN
        String str = "Hi hi Hey Hop La La Lay hihihi";

        //WHEN
        int actual = countHi.countHi(str);
        int expected = 4;

        //THEN
        assertEquals(expected, actual);
    }
}