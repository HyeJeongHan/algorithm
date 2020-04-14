package com.project.algorithm

import com.project.algorithm.codility.GenomicRangeQuery
import org.junit.Assert
import org.junit.Test

class GenomicRangeQueryTest {
    @Test
    fun test() {
        val testClass = GenomicRangeQuery()

        Assert.assertArrayEquals(intArrayOf(2, 4, 1), testClass.solution("CAGCCTA", intArrayOf(2,5,0), intArrayOf(4,5,6)))
    }
}