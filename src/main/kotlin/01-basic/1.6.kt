package `01-basic`

fun printSorted(numbers: List<Int>) {

    if (numbers.isEmpty()) {
        return
    }

    var minNumber = Int.MIN_VALUE
    var currentCount = 0

    // or
    // numbers.forEach
    for (number in numbers) {
        if (number == minNumber) {
            println(number)
            currentCount += 1
        }
    }

    while (currentCount < numbers.size) {
        // First step, current value finds max numbers in the list
        // It will be 12
        var currentValue = numbers.max()

        for (number in numbers) {
            if (number < currentValue && number > minNumber) {
                currentValue = number
            }
        }

        for (number in numbers) {
            if (number == currentValue) {
                println(number)
                currentCount +=1
            }
        }
        minNumber = currentValue
    }

}

fun main() {
    val numbers = listOf(4,2,6,1,10,3,12)
    printSorted(numbers)
}