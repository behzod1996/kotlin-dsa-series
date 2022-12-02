package main.kotlin.programming_skills.day_2

/**
 * 1281. Subtract the product and sum of digits of an integer
 *
 * Given an integer number n,
 * return the difference between the product of its digits and the sum of its digits.
 *
 * Input: n = 234
 * Output: 15
 *
 * Explanation:
 * Product of digits = 2 * 3 * 4 = 24
 * Sum of digits = 2 + 3 + 4 = 9
 * Result = 24 - 9 = 15
 */

private fun subtractProductAndSum(n: Int): Int {
    var product = 1
    var sum = 0
    var carry = n

    while (carry!=0) {
        val digit = carry%10
        carry /=10
        product *=digit
        sum+=digit
    }

    return product-sum

}
fun main() {
    val result = subtractProductAndSum(234)
    print(result)
}
