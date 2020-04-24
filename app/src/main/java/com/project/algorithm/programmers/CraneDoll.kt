package com.project.algorithm.programmers

import java.util.*

class CraneDoll {

    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        // write your code in Kotlin
        var answer = 0

        var stackList = mutableListOf<Stack<Int>>()
        var resultStack = Stack<Int>()


        for (i in board.indices) {

            var stack = Stack<Int>()

            for (j in board[i].indices) {

                if (board[i][j] != 0) {
                    stack.push(board[i][j])
                }

            }

            stackList.add(stack)

        }

        for (i in moves.indices) {

            if (stackList[(moves[i] - 1)].empty()) continue

            var popItem = stackList[(moves[i] - 1)].pop()

            if (popItem == -1) continue

            resultStack.push(popItem)

            var size = resultStack.size

            if (size > 1) {

                println(size)

                if (resultStack.peek() == popItem) {
                    resultStack.pop()
                    answer += 1
                }

            }

        }

        return answer

    }

}