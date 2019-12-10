package com.db.exersize.stringsTest;

import com.db.exersize.strings.SameStarChar;
import org.junit.Test;

import static org.junit.Assert.*;

public class SameStarCharTest {

    private SameStarChar sameStarChar = new SameStarChar();

    @Test
    public void shouldReturnTrueIfStringContainsOfTwoStars() {
        //GIVEN
        String str = "**";

        //WHEN
        Boolean actual = sameStarChar.sameStarChar(str);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void shouldReturnTrueIfStringIsEmpty() {
        //GIVEN
        String str = "";

        //WHEN
        Boolean actual = sameStarChar.sameStarChar(str);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseIfOneOfStarsNoWithTheSameElements() {
        //GIVEN
        String str = "ase*exdr*t";

        //WHEN
        Boolean actual = sameStarChar.sameStarChar(str);

        //THEN
        assertTrue(!actual);
    }

    @Test
    public void shouldReturnTrueIfInAllCasesTheSameLetters() {
        //GIVEN
        String str = "astr*rjjkj*jg";

        //WHEN
        Boolean actual = sameStarChar.sameStarChar(str);

        //THEN
        assertTrue(actual);
    }

    @Test (expected = NullPointerException.class)
    public void shouldCheckExceptionIfStringIsNull(){
        //GIVEN
        String str = null;

        //WHEN

        boolean actual = sameStarChar.sameStarChar(str);
    }
}