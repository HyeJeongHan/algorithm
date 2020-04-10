package com.project.algorithm.codility;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public int frogRiverOne(int X, int[] A) {

        Set<Integer> leafSet = new HashSet<>();

        for (int i = 1; i <= X; i++) {
            leafSet.add(i);
        }

        for (int i = 0; i < A.length; i++) {
            leafSet.remove(A[i]);

            if (leafSet.size() == 0) {

                return i;
            }
        }

        return -1;

    }
}
