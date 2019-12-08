package com.db.exersize.stringsTest;

import com.db.exersize.strings.XyBalance;
import org.junit.Test;

import static org.junit.Assert.*;

public class XyBalanceTest {

    private XyBalance xyBalance = new XyBalance();

    @Test
    public void shouldReturnTrueWhenNoXYInTheStr() {
        //GIVEN
        String str = "The";

        //WHEN
        Boolean actual = xyBalance.xyBalance(str);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void shouldReturnTrueIfExistYForEveryX() {
        //GIVEN
        String str = "sdfsdxjhkjxy";

        //WHEN
        Boolean actual = xyBalance.xyBalance(str);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseIfExistXAfterLastY() {
        //GIVEN
        String str = "sdfsdxjhkjxyfdgdx";

        //WHEN
        Boolean actual = xyBalance.xyBalance(str);

        //THEN
        assertTrue(!actual);
    }

    @Test
    public void shouldReturnTrueIfYMoreThenX() {
        //GIVEN
        String str = "sdfsdxjhkjxyy";

        //WHEN
        Boolean actual = xyBalance.xyBalance(str);

        //THEN
        assertTrue(actual);
    }

    @Test (expected = NullPointerException.class)
    public void shouldCheckExceptionForNullStr(){
        //GIVEN
        String str = null;

        //WHEN
        try {
            Boolean actual = xyBalance.xyBalance(str);
            fail();
        } catch(NullPointerException e){
            assertThat(e.getMessage(), null);
        }
    }
}