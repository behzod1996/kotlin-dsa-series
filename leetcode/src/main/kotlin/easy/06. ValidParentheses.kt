package main.kotlin.easy

import java.util.*

/**
 * Problem Difficulty : Easy
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'
 */
class ValidParentheses {

    fun isValid(s: String): Boolean {
        val stack = Stack<String>()
        /**
         * Stack structure
         * [-3-] -> inserted lastly
         * [-2-] -> inserted secondly
         * [-1-] -> inserted firstly
         */
        s.forEach {
            when (it.toString()) {
                "{" -> stack.push("}")
                "(" -> stack.push(")")
                "[" -> stack.push("]")
                else -> {
                    if (stack.isEmpty() || stack.pop() != it.toString()) {
                        return false
                    }
                }
            }

        }

        return stack.isEmpty()
    }
}

fun main() {
    /**
     * Expected:
     * 1: "(){}}{"
     * 2: "[()]"
     * 3: "[]"
     * 4: ""{[]}"
     */
    val solution = ValidParentheses()
    println(solution.isValid("[()]")) // it will be true
    println(solution.isValid("(){}}{")) // it will be false
    println(solution.isValid("{[]}")) // it will be  true
}