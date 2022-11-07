package `02-linkedlist`

import utils.check

class MyLinkedList2<T: Any> {

    companion object {
        private const val MIN_NUM = 0
    }
    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    private var size = Int.MIN_VALUE

    private fun isEmpty(): Boolean = size == MIN_NUM

    // The method is head first-insertion.
    fun push(value: T) {
        head = Node(value = value, next = head)

        if (tail == null) {
            tail = head
        }
        size ++
    }

    fun pop() {

    }


    override fun toString(): String {
        return if (isEmpty()) {
            return "Empty List"
        } else {
            head.toString()
        }
    }

}

fun main() {
    "push" check {

    }
}