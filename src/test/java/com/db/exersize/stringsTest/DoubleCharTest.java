package com.db.exersize.stringsTest;

import com.db.exersize.strings.DoubleChar;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleCharTest {
    private DoubleChar doubleChar = new DoubleChar();

    @Test
    public void shouldReturnDoubleCharStringTest() {
        //GIVEN
        String str = "The";

        //WHEN
        String actual = doubleChar.doubleChar(str);
        String expected = "TThhee";

        //THEN
        assertEquals(expected, actual);
    }

        @Test
        public void shouldReturnEmptyStringIfGivenIsEmpty() {
            //GIVEN
            String str = "";

            //WHEN
            String actual = doubleChar.doubleChar(str);
            String expected = "";

            //THEN
            assertEquals(expected, actual);
        }

    @Test
    public void shouldReturnDoubleCharStringWhenGivenContainsDifferentSymbols() {
        //GIVEN
        String str = "!&*?.";

        //WHEN
        String actual = doubleChar.doubleChar(str);
        String expected = "!!&&**??..";

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnDoubleCharStringWhenOnlyOneSpaceCharInTheString() {
        //GIVEN
        String str = " ";

        //WHEN
        String actual = doubleChar.doubleChar(str);
        String expected = "  ";

        //THEN
        assertEquals(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void shouldCheckExceptionIfStringISNull(){
        //GIVEN
        String str = null;

        //WHEN
        String actual = doubleChar.doubleChar(str);
    }
}