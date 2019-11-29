package com.db.exersize.strings;

public class SameStarChar {
    public boolean sameStarChar(String str) {
        boolean isTheSame = true;
        boolean helpBool = false;
        for (int i = 1; i < str.length() - 1; ++i) {
            if (str.substring(i, i + 1).equals("*")) {
                if (str.substring(i - 1, i).equals(str.substring(i + 1, i + 2))) {
                    helpBool = true;
                } else {
                    helpBool = false;
                }
                isTheSame = isTheSame && helpBool;
            }
        }
        return isTheSame;
    }
}
