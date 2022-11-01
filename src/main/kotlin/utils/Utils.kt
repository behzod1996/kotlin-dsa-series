package utils

infix fun String.check(function: () -> Unit) {
    println("---Example of $this---")
    function()
    println()
}