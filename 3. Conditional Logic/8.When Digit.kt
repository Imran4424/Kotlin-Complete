

fun main(args: Array<String>) {
    var digit = 7

    when (digit) {
        // condition -> statement
        0 -> println("Zero")
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        6 -> println("Six")
        7 -> println("Seven")
        8 -> println("Eight")
        9 -> println("Nine")
        // default condition -> default statement
        else -> println("Not a digit")
    }

}