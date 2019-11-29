package com.db.exersize.stringsTest;

import com.db.exersize.strings.XyBalance;
import org.junit.Test;

import static org.junit.Assert.*;

public class XyBalanceTest {

    XyBalance xyBalance = new XyBalance();

    @Test
    public void ShouldCheckYForEveryXTest1() {
        //GIVEN
        String str = "The";

        //WHEN
        Boolean actual = xyBalance.xyBalance(str);
        Boolean expected = true;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCheckYForEveryXTest2() {
        //GIVEN
        String str = "sdfsdxjhkjxy";

        //WHEN
        Boolean actual = xyBalance.xyBalance(str);
        Boolean expected = true;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCheckYForEveryXTest3() {
        //GIVEN
        String str = "sdfsdxjhkjxyfdgdx";

        //WHEN
        Boolean actual = xyBalance.xyBalance(str);
        Boolean expected = false;

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCheckYForEveryXTest4() {
        //GIVEN
        String str = "sdfsdxjhkjxyy";

        //WHEN
        Boolean actual = xyBalance.xyBalance(str);
        Boolean expected = true;

        //THEN
        assertEquals(expected, actual);
    }
}