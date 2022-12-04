package main.kotlin.programming_skills.day_3

/**
 * 1502. Can Make Arithmetic Progression From Sequence
 *
 * A sequence of numbers is called an arithmetic progression
 * if the difference between any two consecutive elements is the same.
 *
 * Given an array of numbers arr, return true if the array
 * can be rearranged to form an arithmetic progression. Otherwise, return false.
 *
 * Input: arr = [3,5,1]
 * Output: true
 * Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively,
 * between each consecutive elements.
 *
 * Input: arr = [1,2,4]
 * Output: false
 * Explanation: There is no way to reorder the elements to obtain an arithmetic progression.
 */

private fun canMakeArithmeticProgression(arr: IntArray): Boolean {
    if (arr.isEmpty()) return false

    arr.sort()

    val diff = arr[0]-arr[1]

    for (number in 1 .. arr.lastIndex) {
        if (arr[number]-arr[number-1]!=diff) return false
    }

    return true
}

fun main() {

}