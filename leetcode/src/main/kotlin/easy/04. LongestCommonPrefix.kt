package main.kotlin.easy

/**
 * Problem  Difficulty :  Easy
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 *
 * Output: "fl"

 */
class LongestCommonPrefix {

    fun solve(strs: Array<String>): String {

        if (strs.isEmpty()) return ""
        if (strs.size == 1) return strs[0]

        /**
         * Returns a list of all elements sorted according to their natural sort order.
         */
        strs.sort()

        /**
         * Returns the range of valid character indices for this char sequence.
         * strs[0].indices returns 2
         *
         */
        for (index in strs[0].indices) {
            if (strs[0][index] != strs[strs.size - 1][index]) {
                return strs[0].substring(0, index)
            }

        }

        return strs[0]
    }
}

fun main() {
    val sol = LongestCommonPrefix()
    val strs = arrayOf("ab","a")

    print(sol.solve(strs))

}