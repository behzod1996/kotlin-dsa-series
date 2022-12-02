package main.kotlin.programming_skills.day_1

/**
 * 1523. Count Odd Numbers in an Interval Range
 *
 * Given two non-negative integers low and high.
 * Return the count of odd numbers between low and high(inclusive).
 */

private fun solve(low: Int, high: Int): Int {
    var difference = (high - low) / 2
    if (low % 2 == 1 || high % 2 == 1) difference++
    return difference
}

fun main() {
    val result = solve(3, 7)
    println(result)
}