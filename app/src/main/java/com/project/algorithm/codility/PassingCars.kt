package com.project.algorithm.codility

import java.util.*

class PassingCars {

    fun solution(A: IntArray): Int {

        var list = A.toList()

        var resultCounts = 0
        var oneCount = 0
        var totalCount = Collections.frequency(list, 1)

        for (i in A.indices) {

            if (A[i] == 0) {
                resultCounts += (totalCount - oneCount)

                if (resultCounts > 1000000000) return -1

            } else {
                oneCount++
            }
        }

        return resultCounts
    }


}