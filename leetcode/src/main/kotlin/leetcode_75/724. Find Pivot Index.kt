package main.kotlin.leetcode_75

/**
 * 724. Find Pivot Index
 *
 * Given an array of integers numbers,calculate the pivot index of this array.
 *
 * The pivot index is the index where the sum of all the numbers strictly
 * to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 *
 * If the index is on the left edge of the array, then the left sum is 0 because
 * there are no elements to the left. This also applies to the right edge of the array.
 *
 * Return the leftmost pivot index. If no such index exists, return -1.
 */

private fun findPivotIndex(nums: IntArray): Int {
    var totalSum = 0

    for (number in nums.indices) {
        totalSum+=nums[number]
    }
    var leftSum = 0

    for (number in nums.indices) {

        val rightSum = totalSum - nums[number] - leftSum
        if (rightSum == leftSum) {
            return number
        }
        leftSum += nums[number]


    }

    return -1
}

fun main() {
    val numbers = intArrayOf(1,7,3,6,5,6)
    val result = findPivotIndex(numbers)
    println(result)
}