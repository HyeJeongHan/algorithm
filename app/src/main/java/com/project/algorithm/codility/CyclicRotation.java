package com.project.algorithm.codility;

import java.util.ArrayList;
import java.util.List;

public class CyclicRotation {
    public int[] cyclicRotation(int[] A, int K) {

        if (K == 0) return A;
        if (A.length <= 1) return A;

        int nmg = K % A.length;

        if (nmg == 0) return A;

        int[] returnArray = new int[A.length];

        List<Integer> list = new ArrayList<>();
        for(int i : A) {
            list.add(i);
        }
        for(int i : A) {
            list.add(i);
        }

        int startIdx = A.length - nmg;

        for(int i = startIdx; i < startIdx + A.length; i++) {
            returnArray[i-startIdx] = list.get(i);
        }

        return returnArray;

    }
}
