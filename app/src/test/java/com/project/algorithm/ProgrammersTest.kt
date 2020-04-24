package com.project.algorithm

import com.project.algorithm.codility.CountDiv
import com.project.algorithm.programmers.CraneDoll
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ProgrammersTest {
    @Test
    fun craneDoll() {

        val testClass = CraneDoll()

        val a1 = arrayOf(0,0,0,0,0).toIntArray()
        val a2 = arrayOf(0,0,1,0,3).toIntArray()
        val a3 = arrayOf(0,2,5,0,1).toIntArray()
        val a4 = arrayOf(4,2,4,4,2).toIntArray()
        val a5 = arrayOf(3,5,1,3,1).toIntArray()

        assertEquals(4, testClass.solution(
                arrayOf(a1, a2, a3, a4, a5), arrayOf(1,5,3,5,1,2,1,4).toIntArray()))
    }
}
