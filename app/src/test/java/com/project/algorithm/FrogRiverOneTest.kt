package com.project.algorithm

import com.project.algorithm.codility.FrogRiverOne
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class FrogRiverOneTest {
    @Test
    fun test() {

        val testClass = FrogRiverOne()

        assertEquals(6, testClass.frogRiverOne(5, intArrayOf(1, 3, 1, 4, 2, 3, 5, 4)))
    }
}
