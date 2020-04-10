package com.project.algorithm

import com.project.algorithm.codility.TapeEquilibrium
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class TapeEquilibriumTest {
    @Test
    fun test() {

        val testClass = TapeEquilibrium()

        assertEquals(1, testClass.tapeEquilibrium(intArrayOf(3, 1, 2, 4, 3)))
    }
}
