package com.project.algorithm.codility;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    public int missingInteger(int[] A) {

        Set<Integer> foundNums = new HashSet<>();

        for (int a : A) {
            foundNums.add(a);
        }

        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            if (!foundNums.contains(i)) {
                return i;
            }
        }

        return -1;


    }
}
