package main.kotlin.programming_skills.day_3

/**
 * 1790. Check if One String Swap Can Make Strings Equal
 *
 * You are given two strings s1 and s2 of equal length.
 * A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.
 *
 * Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.
 */

private fun areAlmostEqual(s1: String, s2: String): Boolean {
    val nonEqual = s1.indices.filter { s1[it]!=s2[it]}
    println(nonEqual)
    return nonEqual.isEmpty() || nonEqual.size==2 && run {
        val (left, right) = nonEqual
        val left2 = nonEqual[left]
        val right2 = nonEqual[right]
        println(left2)
        println(right2)
        s1[left] == s2[right] && s1[right] == s2[left]
    }
}

fun main() {
    val result = areAlmostEqual("bank","kanb")
    print(result)
}