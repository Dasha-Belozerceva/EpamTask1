package com.db.exersize.arrays;

public class program {
    public static void main(String[] args) {
        FizzArray fizzArray = new FizzArray();
        int[] result = fizzArray.fizzArray(5);
        for (int i = 0; i < result.length; ++i) {
            System.out.println(result[i]);
        }

        ShiftLeft shiftLeft = new ShiftLeft();
        int[] newArr = shiftLeft.shiftLeft(new int[] {6, 2, 5, 3});
        for (int i = 0; i < newArr.length; ++i) {
            System.out.println(newArr[i]);
        }

        No14 no14 = new No14();
        Boolean noContains = no14.no14(new int[] {5, 1, 3 , 4});
        System.out.println(noContains);

        Post4 post4 = new Post4();
        int[] shortArr = post4.post4(new int[] {6, 4, 7, 8, 4, 9, 13});
        for (int i = 0; i < shortArr.length; ++i){
            System.out.println(shortArr[i]);
        }

        MatchUp matchUp = new MatchUp();
        int count = matchUp.matchUp(new int [] {1, 5, 6}, new int[] {6, 1, 2});
        System.out.println(count);
    }
}
