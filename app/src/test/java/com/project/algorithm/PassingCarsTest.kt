package com.project.algorithm

import com.project.algorithm.codility.PassingCars
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class PassingCarsTest {
    @Test
    fun test() {

        val testClass = PassingCars()

        assertEquals(5, testClass.solution(intArrayOf(0, 1, 0, 1, 1)))
    }
}
