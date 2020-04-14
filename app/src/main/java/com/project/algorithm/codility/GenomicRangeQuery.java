package com.project.algorithm.codility;

import java.util.Arrays;

public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {

        int[] resultArray = new int[P.length];

        if (S.contains("A")) {
            S = S.replaceAll("A", "1");
        }
        if (S.contains("C")) {
            S = S.replaceAll("C", "2");
        }
        if (S.contains("G")) {
            S = S.replaceAll("G", "3");
        }
        if (S.contains("T")) {
            S = S.replaceAll("T", "4");
        }

        String[] stringArray = S.split("");

        for (int i = 0; i < P.length; i++) {

            int min = 4;

            for (int j = P[i]; j < Q[i]; j++) {

                int sValue = Integer.valueOf(stringArray[j]);

                if (sValue <= min) {
                    min = sValue;
                }

            }

            resultArray[i] = min;

            System.out.println(min);
        }

        System.out.println(Arrays.toString(resultArray));

        return resultArray;

    }
}
