package com.db.exersize.strings;

public class XyBalance {
    public boolean xyBalance(String str) {
        int indexX = str.lastIndexOf("x");
        int indexY = str.lastIndexOf("y");
        return indexX <= indexY;
    }
}
