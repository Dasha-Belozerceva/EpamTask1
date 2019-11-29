package com.db.exersize.strings;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        String partOfString = str.substring(str.length() - n, str.length());
        String finalString = "";
        for (int i = 0; i < n; ++i) {
            finalString += partOfString;
        }
        return finalString;
    }

}
