package basic

fun multiplicationTable(size: Int) {
    for (number in 1..size) {
        print("|")
        for (otherNumber in 1..size) {
            print("$number x $otherNumber = ${number * otherNumber} | ")
        }
        println()
    }
}

fun main() {
    multiplicationTable(2)
}