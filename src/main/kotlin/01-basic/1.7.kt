package `01-basic`

fun pseudoBinaryContains(value: Int, numbers: List<Int>): Boolean {
    if (numbers.isEmpty()) return false

    val middleIndex = numbers.size / 2

    // Assume, the value is 45.
    // It checks equal to middle index.
    // Numbers: [20,30,50,60,100,120,130,140]
    // Middle index: 4
    // Numbers[middle_index]: 60
    // If the middle index less than the value, the loop will be start.
    // From 0 to middleIndex: our case the middle index is 4.
    // So, it iterates 4 time.
    // Then, we check the values in the list with our input value.
    // If we find desired the value, it returns true.
    if (value <= numbers[middleIndex]) {
        for (index in 0..middleIndex) {
            if (numbers[index] == value) {
                return true
            }
        }
    } else {
        // If the value greater than the input value,
        // It iterates from middle index to numbers.size
        // Middle index: 4
        // Numbers.size: 8
        // It iterates 4 to 7, because we use 'until' keyword.
        // // If we find desired the value, it returns true.
        for (index in middleIndex until numbers.size) {
            if (numbers[index] == value) {
                return true
            }
        }
    }
    return false
}