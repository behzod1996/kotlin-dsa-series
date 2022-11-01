package `02-linkedlist`


import utils.check

data class Node<T : Any>(
    val value: T,
    var next: Node<T>? = null
) {
    override fun toString(): String {
        return if (next!=null) {
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}

private fun main() {
    val node1 = Node(1)
    val node2 = Node(2)
    val node3 = Node(3)

    node1.next = node2
    node2.next = node3

    "creating and linking nodes" check {
        println(node1)
    }

}