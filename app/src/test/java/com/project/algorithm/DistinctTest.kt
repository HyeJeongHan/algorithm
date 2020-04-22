package com.project.algorithm

import com.project.algorithm.codility.CountDiv
import com.project.algorithm.codility.Distinct
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class DistinctTest {
    @Test
    fun test() {

        val testClass = Distinct()

        assertEquals(1, testClass.solution(intArrayOf(0)))
    }
}
