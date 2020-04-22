package com.project.algorithm.codility

class Distinct {

    fun solution(A: IntArray): Int {
        // write your code in Kotlin

        val hashSet = hashSetOf<Int>()

        for (item in A) {
            hashSet.add(item)
        }

        return hashSet.size
    }

}