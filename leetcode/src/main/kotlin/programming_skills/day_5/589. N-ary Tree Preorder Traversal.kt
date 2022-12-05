package main.kotlin.programming_skills.day_5

/**
 * 589. N-ary Tree Preorder Traversal
 *
 * n dan boshlab ketma-ketlikda tashrif buyurish
 *
 * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
 *
 * Nary-Tree input serialization is represented in their level order traversal.
 * Each group of children is separated by the null value (See examples)
 *
 * Input: root = [1,null,3,2,4,null,5,6]
 * Output: [1,3,5,6,2,4]
 */

data class Node(var node: Int, var children: List<Node> = emptyList())

private fun preorder(root: Node?): List<Int> {
    val integers: List<Int> = arrayListOf<Int>()

    integers.plus(checkNotNull(root?.node))

    for (i in checkNotNull(root?.children).indices) {
        integers.plus(preorder(root?.children!![i]))
    }

    return integers
}

fun main() {
    val one = 1
    val binary = Integer.toBinaryString(one)
    println(binary)
}
