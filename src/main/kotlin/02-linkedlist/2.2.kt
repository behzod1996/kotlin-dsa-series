package `02-linkedlist`

import utils.check

class LinkedList<T : Any> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    override fun toString(): String {
        return if (hasEmpty()) {
            "Empty list"
        } else {
            head.toString()
        }
    }

    private fun hasEmpty(): Boolean = size == 0

    fun push(value: T) {
        head = Node(value = value, next = head)

        if (tail == null) {
            tail = head
        }
        size++

    }

}

fun main() {
    val list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)

    "create and push linked list" check {
        println(list)
    }
}