package main.kotlin.easy

/**
 * Given an array of integers numbers and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
class Solution {
    fun twoSum(numbers: IntArray,target: Int): IntArray {
        for (number1 in 0 until numbers.size-1) {
            for (number2 in number1+1 until numbers.size) {
                if (numbers[number1] + numbers[number2] == target) {
                    println("[$number1]+[$number2] = [$target]")
                }
            }
        }
        return intArrayOf()
    }

    companion object {
        fun instance(): Solution {
            return Solution()
        }
    }
}

fun main() {
    val temp = intArrayOf(3,3,5)
    val sol = Solution.instance()

    sol.twoSum(temp,6)

}