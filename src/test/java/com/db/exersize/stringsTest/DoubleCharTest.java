package com.db.exersize.stringsTest;

import com.db.exersize.strings.DoubleChar;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleCharTest {
    DoubleChar doubleChar = new DoubleChar();

    @Test
    public void ShouldReturnDoubleCharStringTest1() {
        //GIVEN
        String str = "The";

        //WHEN
        String actual = doubleChar.doubleChar(str);
        String expected = "TThhee";

        //THEN
        assertEquals(expected, actual);
    }

        @Test
        public void ShouldReturnDoubleCharStringTest2() {
            //GIVEN
            String str = "";

            //WHEN
            String actual = doubleChar.doubleChar(str);
            String expected = "";

            //THEN
            assertEquals(expected, actual);
        }

    @Test
    public void ShouldReturnDoubleCharStringTest3() {
        //GIVEN
        String str = "!&*?.";

        //WHEN
        String actual = doubleChar.doubleChar(str);
        String expected = "!!&&**??..";

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnDoubleCharStringTest4() {
        //GIVEN
        String str = "La puta";

        //WHEN
        String actual = doubleChar.doubleChar(str);
        String expected = "LLaa  ppuuttaa";

        //THEN
        assertEquals(expected, actual);
    }
}