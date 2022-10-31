package basic

fun findBinaryNumber(value: Int, numbers: List<Int>): Boolean {

    if (numbers.isEmpty()) return false

    val middleIndex = numbers.size / 2

    if (value <= numbers[middleIndex]) {
        for (index in 0..middleIndex) {
            if (numbers[index]==value) {
                return true
            }
        }
    } else {
        for (index in middleIndex until numbers.size) {
            if (numbers[index] == value) {
                return true
            }
        }
    }
    return false
}

fun main() {
    val numbers = listOf(10,20,30,40,50,60,100,232)
    val result = findBinaryNumber(60, numbers)
    print(result)
}