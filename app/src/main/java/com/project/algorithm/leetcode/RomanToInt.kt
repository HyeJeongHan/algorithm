package com.project.algorithm.leetcode

import java.util.*

class RomanToInt {
    fun romanToInt(s: String): Int {

        var valueArray = IntArray(s.length)
        var count = 0

        var totalResult = 0
        var temp = 0

        for (i in s) {

            when (i) {
                'I' -> {
                    valueArray[count] = 1
                }
                'V' -> {
                    valueArray[count] = 5
                }
                'X' -> {
                    valueArray[count] = 10
                }
                'L' -> {
                    valueArray[count] = 50
                }
                'C' -> {
                    valueArray[count] = 100
                }
                'D' -> {
                    valueArray[count] = 500
                }
                'M' -> {
                    valueArray[count] = 1000
                }
            }

            count++

        }

        println(valueArray.contentToString())

        for (i in valueArray.indices) {

            if (i == 0) {

                temp = valueArray[i]
                if (i != valueArray.size - 1) {
                    if (temp >= valueArray[i + 1]) {
                        totalResult += temp
                    }
                } else {

                    totalResult += temp
                }
                continue

            } else {

                if (i != valueArray.size - 1) {
                    //마지막 배열이 아닐때
                    if (valueArray[i] < valueArray[i + 1]) {
                        //나보다 다음 숫자가 더 클때
                        temp = valueArray[i]
                        continue
                    }
                }

                totalResult += if (temp < valueArray[i]) {
                    //두 변수 빼기
                    valueArray[i] - temp

                } else {
                    //합치기
                    valueArray[i]
                }

            }


        }

        println(totalResult)

        return totalResult

        /* 간단한 해결책 ㅜㅜ

        var sum = 0
        for(i in valueArray.indices - 1){
            if(valueArray[i] < valueArray[i+1])
                sum -= valueArray[i]
            else
                sum += valueArray[i]
        }

        return sum + valueArray[valueArray.size-1]

         */

    }
}