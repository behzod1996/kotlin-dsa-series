package `01-basic`

/**
 * Linear Time:
 * Its complexity is usually the easiest to understand.
 * As the amount of data increases, the running time increases by the same amount.
 * The Big O notation for linear time is O(n).
 */

fun main() {
    val names = listOf("Behzod","Oybek","Abdurahmon","Sardor")

    for (name in names) {
        println("Name is $name")
    }
}