package com.db.exersize.stringsTest;

import com.db.exersize.strings.CountHi;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountHiTest {
    private CountHi countHi = new CountHi();

    @Test
    public void shouldReturnZeroIfEmptyString() {
        //GIVEN
        String str = "";

        //WHEN
        int actual = countHi.countHi(str);
        int expected = 0;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckIfUppercaseDoesntCount() {
        //GIVEN
        String str = "HiHIhi";

        //WHEN
        int actual = countHi.countHi(str);
        int expected = 1;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckIfUppercaseWithSpacesDoesntCount() {
        //GIVEN
        String str = "HI! there Hi";

        //WHEN
        int actual = countHi.countHi(str);
        int expected = 0;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckIfIsCountWithSpacesAndNoSpacesBetween() {
        //GIVEN
        String str = "Hi hi Hey Hop La La Lay hihihi";

        //WHEN
        int actual = countHi.countHi(str);
        int expected = 4;

        //THEN
        assertEquals(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void shouldCheckExceptionWhenNullString(){
        //GIVEN
        String str = null;

        //WHEN
        int actual = countHi.countHi(str);
    }
}