package main.kotlin.easy

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 */

data class ListNode(
    val value: Int,
    var next: ListNode? = null
) {
    override fun toString(): String {
        return if (next!=null) {
            "$value -> $next"
        } else {
            "$value"
        }
    }
}

class AddTwoNumbers {

    fun add(l1: ListNode?,  l2: ListNode?): ListNode? {
        var lnode1 = l1
        var lnode2 = l2

        val dummyHead = ListNode(0)
        var curr = dummyHead

        var carry = 0
        var sum = 0

        while(lnode1.isNotNull() || lnode2.isNotNull() || carry.isNotZero()) {
            val x = lnode1?.value ?: 0
            val y =  lnode2?.value ?: 0

            sum += carry + x+  y

            carry = sum/10

            curr.next = ListNode(sum%10)
            curr = curr.next ?: ListNode(0)

            if (lnode1.isNotNull()) lnode1 = lnode1?.next
            if (lnode2.isNotNull()) lnode2 = lnode2?.next
        }
        return dummyHead.next
    }
}

fun main() {
    val lnode1 = ListNode(1)
    val lnode2 = ListNode(2)
    lnode1.next = lnode2

    val lnode3 = ListNode(5)
    val lnode4 = ListNode(6)
    lnode3.next = lnode4

    val solution = AddTwoNumbers()
    val result = solution.add(l1 = lnode1, l2 = lnode3)
    println(result)
}

private fun ListNode?.isNotNull(): Boolean {
    return this != null
}

private fun Int?.isNotZero(): Boolean {
    return this != 0
}