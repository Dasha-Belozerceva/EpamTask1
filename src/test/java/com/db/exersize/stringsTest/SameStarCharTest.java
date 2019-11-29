package com.db.exersize.stringsTest;

import com.db.exersize.strings.SameStarChar;
import org.junit.Test;

import static org.junit.Assert.*;

public class SameStarCharTest {

    SameStarChar sameStarChar = new SameStarChar();

    @Test
    public void ShouldCheckLettersNearStarTest1() {
        //GIVEN
        String str = "**";

        //WHEN
        Boolean actual = sameStarChar.sameStarChar(str);
        Boolean expected = true;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCheckLettersNearStarTest2() {
        //GIVEN
        String str = "";

        //WHEN
        Boolean actual = sameStarChar.sameStarChar(str);
        Boolean expected = true;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCheckLettersNearStarTest3() {
        //GIVEN
        String str = "ase*exdr*t";

        //WHEN
        Boolean actual = sameStarChar.sameStarChar(str);
        Boolean expected = false;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCheckLettersNearStarTest4() {
        //GIVEN
        String str = "astr*rjjkj*jg";

        //WHEN
        Boolean actual = sameStarChar.sameStarChar(str);
        Boolean expected = true;

        //THEN
        assertEquals(expected, actual);
    }
}