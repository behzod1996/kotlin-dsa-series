package main.kotlin.leetcode_75

/**
 * 1480. Running Sum of 1d Array
 *
 * Given an array nums. We define a running sum of an array as
 *
 * runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 */

private fun runningSum(sums: IntArray): IntArray {
    val target = IntArray(sums.size)
    target[0] = sums[0]
    println("Sums size is ${sums.size}")
    println("Target size is ${target.size}")
    println("Indices are ${sums.indices}")

    for (i in 1 until sums.size) {
        // first iteration: sums[1]: 1, target[0] =1+2 = target[2] = 3
        target[i] = sums[i] + target[i - 1]
    }

    return target
}

fun main() {
    val list = intArrayOf(1, 2, 3, 4, 5)
    val result = runningSum(list).toList()
    print(result)
}