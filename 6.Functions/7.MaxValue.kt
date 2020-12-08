
/*
* function
* no parameters and no return type
* */

fun maxValue(x: Int, y: Int): Int {
    return if (x > y) {
        x
    } else {
        y
    }
}

fun main(args: Array<String>) {
    println("The largest number is: ${maxValue(4, 8)}")
}