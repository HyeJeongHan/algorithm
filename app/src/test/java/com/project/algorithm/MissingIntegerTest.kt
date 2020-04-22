package com.project.algorithm

import com.project.algorithm.codility.MissingInteger
import org.junit.Assert
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MissingIntegerTest {
    @Test
    fun test() {

        val testClass = MissingInteger()

        Assert.assertEquals(1, testClass.missingInteger(intArrayOf(-1000000, 1000000)))
    }
}
