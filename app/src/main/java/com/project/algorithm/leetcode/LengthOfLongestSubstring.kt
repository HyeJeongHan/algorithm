package com.project.algorithm.leetcode

class LengthOfLongestSubstring {
    fun lengthOfLongestSubstring(s: String): Int {

        var maxLength = 0
        var subString = ""


        for (i in s.indices) {

            subString = s.substring(i, s.length)
            var temp = ""

            for (c in subString) {

                println("subString >> $subString")

                if (temp == "") {
                    //문자열이 없을때
                    temp += c
                } else {

                    if (temp.indexOf(c) > -1) {
                        //문자열이 있을때
                        break

                    } else {
                        //없을때
                        temp += c
                    }

                }

            }


            if (maxLength < temp.length) {
                maxLength = temp.length

                println("temp >> $temp")
                println(">>>>>>>>>>>>>>>>>")
            }
        }

        println(maxLength)

        return maxLength
    }
}