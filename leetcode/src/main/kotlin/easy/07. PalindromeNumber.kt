package main.kotlin.easy

import main.kotlin.utils.isNullOrEmpty

/**
 * Problem Difficulty : Easy
 *
 * Given an integer x, return true if x is a palindrome,
 * and false otherwise.
 */
class PalindromeNumber {

    fun solve(number: Int): Boolean {
        if (number <= 0) return false


        // Input: 121
        // str.length / 2 =
        val str = number.toString()

        for (index in 0..(str.length/2)) {
            if (str[index]  != str[str.length - 1 - index]) return false

            return true
        }
        return true
    }

}

fun main() {
    val solution = PalindromeNumber()
    val result = solution.solve(121)
    println(result)
}