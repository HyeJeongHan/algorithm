package com.project.algorithm.codility;

public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {

        String[] stringArray = new String[P.length];

        for (int i = 0; i < P.length; i++) {
            stringArray[i] = S.substring(P[i], Q[i] + 1);
        }

        int[] resultArray = new int[P.length];

        for (int i = 0; i < P.length; i++) {

            System.out.println(stringArray[i]);

            if (stringArray[i].contains("A")) {
                resultArray[i] = 1;
            } else if (stringArray[i].contains("C")) {
                resultArray[i] = 2;
            } else if (stringArray[i].contains("G")) {
                resultArray[i] = 3;
            } else if (stringArray[i].contains("T")) {
                resultArray[i] = 4;
            }

        }

        return resultArray;

    }
}
