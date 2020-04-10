package com.project.algorithm.codility;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

    public int permCheck(int[] A) {

        Set<Integer> set = new HashSet<>();

        for (int i : A) {
            set.add(i);
        }

        for (int i = 0; i < A.length; i++) {

            if (!set.contains(i + 1)) {
                return 0;
            }
        }

        return 1;
    }
}
