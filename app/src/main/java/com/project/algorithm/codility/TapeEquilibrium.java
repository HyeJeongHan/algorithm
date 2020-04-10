package com.project.algorithm.codility;

public class TapeEquilibrium {

    public int tapeEquilibrium(int[] A) {

        int min = Integer.MAX_VALUE;
        int sum = 0;
        int tapeOne = 0;
        int tapeTwo = 0;

        for (int i : A) {
            sum += i;
        }

        System.out.println("sum > "+ sum);

        for (int P = 1; P < A.length; P++) {

            tapeOne += A[P-1];
            tapeTwo = sum - tapeOne;


            System.out.println("tapeOne > "+ tapeOne);
            System.out.println("tapeTwo > " + tapeTwo);

            int tapeAbs = Math.abs(tapeOne - tapeTwo);

            System.out.println("tapeAbs > " + tapeAbs);

            if (min >= tapeAbs) {

                min = tapeAbs;

            }

            System.out.println("===========================");

        }

        return min;


    }
}
