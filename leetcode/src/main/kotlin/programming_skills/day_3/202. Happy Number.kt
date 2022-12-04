package main.kotlin.programming_skills.day_3

/**
 * 202. Happy Number
 *
 * Write an algorithm to determine if a number n is happy.
 *
 * A happy number is a number defined by the following process:
 * Starting with any positive integer,
 * replace the number by the sum of the squares of its digits.
 *
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 *
 * Those numbers for which this process ends in 1 are happy.
 *
 * Return true if n is a happy number, and false if not.
 */

private fun isHappyNumber(n: Int): Boolean {
    val carries = HashSet<Int>()

    return n.recursion(carries)
}

private fun Int.recursion(hashNumbers: HashSet<Int>): Boolean {
    if (this == 1) return true

    if (hashNumbers.contains(this)) return false
    else hashNumbers.add(this)

    var curr = this
    var sum = 0

    while (curr!=0) {
        sum+=(curr%10)*(curr%10)
        curr/=10
    }

    return this.recursion(hashNumbers)
}