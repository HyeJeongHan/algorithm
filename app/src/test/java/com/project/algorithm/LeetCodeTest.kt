package com.project.algorithm

import com.project.algorithm.codility.CountDiv
import com.project.algorithm.leetcode.LengthOfLongestSubstring
import com.project.algorithm.leetcode.RomanToInt
import com.project.algorithm.programmers.CraneDoll
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class LeetCodeTest {
    @Test
    fun romanToInt() {

        val testClass = RomanToInt()
        testClass.romanToInt("MCMXCIV")

    }

    @Test
    fun lengthOfLongestSubstring() {

        val testClass = LengthOfLongestSubstring()
        testClass.lengthOfLongestSubstring("pwwkew")

    }
}
