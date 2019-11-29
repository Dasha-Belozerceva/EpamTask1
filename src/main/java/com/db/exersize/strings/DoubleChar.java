package com.db.exersize.strings;

public class DoubleChar {
    public String doubleChar(String str) {
        String finalStr = "";
        for (int i = 0; i < str.length(); i++) {
            finalStr += str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        return finalStr;
    }

}
