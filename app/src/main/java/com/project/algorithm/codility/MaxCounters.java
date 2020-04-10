package com.project.algorithm.codility;

public class MaxCounters {

    public int[] maxCounters(int N, int[] A) {

        int temp = 0;
        int max = 0;

        int[] resultArray = new int[N];

        for (int i = 0; i < A.length; i++) {

            if (A[i] > N) {
                max = temp;
                continue;
            }

            if (resultArray[A[i] - 1] < max) {
                resultArray[A[i] - 1] = max;
            }

            resultArray[A[i] - 1]++;

            if (temp < resultArray[A[i] - 1]) {
                temp = resultArray[A[i] - 1];

            }

        }

        for (int i = 0; i < N; i++) {
            if (max > resultArray[i]) {
                resultArray[i] = max;
            }
        }

        return resultArray;

        /*
                if (A.length == 1) {
            return new int[]{1};
        }

        int max = 0;
        int valueMax = 0;
        int[] resultArray = new int[N];

        for (int i : A) {
            if (max <= i) {
                max = i;
            }
        }

        for (int i = 0; i < A.length; i++) {

            if (A[i] == max) {

                for (int ii : resultArray) {
                    if (valueMax <= ii) {
                        valueMax = ii;
                    }
                }

                Arrays.fill(resultArray, valueMax);


            } else {
                resultArray[A[i] - 1]++;
            }


        }

        return resultArray;
         */

    }

}
