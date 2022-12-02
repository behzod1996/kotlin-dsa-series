package main.kotlin.programming_skills.day_1

/**
 * 1491. Average Salary Excluding the Minimum and Maximum Salary
 *
 * You are given an array of unique integers salary
 * where salary i is the salary of the ith employee.
 * Return the average salary of employees excluding the minimum and maximum salary.
 *
 * Answers within 10-5 of the actual answer will be accepted.
 */

private fun solve(salaries: IntArray): Double {
    if (salaries.isEmpty()) return 0.0

    // it represented the sum of salaries.
    var sum = 0.0
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE

    // salaries: [4000,3000,1000,2000]
    // it iterates the size of salaries.
    salaries.forEach { salary ->
        // it adds per salary to sum.
        max = maxOf(salary,max)
        min = minOf(salary,min)
        sum+=salary
    }

    // sum: 10,000
    // salaries size: 4
    // it divides the sum with size of salaries.
    return (sum - (max+min))/ (salaries.size-2)
}

fun main() {
    val result = solve(intArrayOf(8000,9000,2000,3000,6000,1000))
    // 28,000/6
    println(result)
}