package com.project.algorithm.codility;

import java.util.Arrays;

public class PermMissingElem {
    public int permMissingElem(int[] A) {
        // write your code in Java SE 8

        if (A.length == 0) return 1;
        if (A.length == 1) {

            if (A[0] == 1) {
                return 2;
            } else {
                return 1;
            }
        }

        int current;
        int next = 0;

        int answer;

        Arrays.sort(A);

        for (int i = 0; i < A.length -1; i++) {

            current = A[i];
            next = A[i+1];

            if (i == 0) {
                if (current != 1) {
                    return 1;
                }
            }


            if (next - current > 1) {
                answer = current += 1;
                return answer;
            }
        }

        return next += 1;
    }
}
