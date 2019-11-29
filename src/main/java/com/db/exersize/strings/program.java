package com.db.exersize.strings;

public class program {
    public static void main(String[] args) {
        DoubleChar doubleChar = new DoubleChar();
        String result = doubleChar.doubleChar("daryaB");
        System.out.println(result);

        SameStarChar sameStarChar = new SameStarChar();
        Boolean answer = sameStarChar.sameStarChar("Abba*abba");
        System.out.println(answer);

        RepeatEnd repeatEnd = new RepeatEnd();
        String result2 = repeatEnd.repeatEnd("Bodibodiboo", 3);
        System.out.println(result2);

        XyBalance xyBalance = new XyBalance();
        Boolean check = xyBalance.xyBalance("dfgxkjeweyx");
        System.out.println(check);

        CountHi countHi = new CountHi();
        int count = countHi.countHi("gthigthrthihdfd");
        System.out.println(count);
    }
}
