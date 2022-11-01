package `01-basic`

/**
 * Constant time:
 * A constant time algorithm is one that has
 * the same running time regardless of the size of the input.
 * The Big O notation for constant time is O(1).
 */

fun checkFirst(values: List<String>): String {
    return if (values.firstOrNull() != null) {
        values.first()
    } else {
        "No values"
    }
}

fun checkFirstOrNull(values: List<String>): String? {
    return if (values.firstOrNull() != null) {
        values.first()
    } else {
        null
    }
}

fun main() {
    val names = listOf("Behzod")
    val emptyNames = emptyList<String>()

    println(checkFirst(names))
    println(checkFirstOrNull(emptyNames))
}