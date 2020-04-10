package com.project.algorithm.codility;

public class CountDiv {

    public int countDiv(int A, int B, int K) {
        if (A % K == 0)
            return B / K - A / K + 1;
        return B / K - A / K;

    }
}
