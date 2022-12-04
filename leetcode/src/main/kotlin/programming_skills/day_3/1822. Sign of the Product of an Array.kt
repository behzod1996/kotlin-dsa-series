package main.kotlin.programming_skills.day_3

/**
 * 1822. Sign of the Product of an Array
 *
 * There is a function signFunc(x) that returns:
 *
 * 1 if x is positive.
 * -1 if x is negative.
 * 0 if x is equal to 0.
 *
 * You are given an integer array nums. Let product be the product of all values in the array nums.
 *
 * Return signFunc(product).
 */

private fun arraySign(numbers: IntArray): Int {
    if (numbers.isEmpty()) return 0

    var carry = 0

    for (number in numbers) {
        if (number==0) return 0
        if(number<0) carry++
    }

    return if (carry%2==0) 1 else -1
}


fun main() {
    val numbers = intArrayOf(-1,-2,-3,-4,3,2,1)
    val result = arraySign(numbers)
    println(result)
}