
/*
* function
* as expression
* */

fun maxValue(x: Int, y: Int): Int = if ( x > y) { x } else { y }

fun main(args: Array<String>) {
    println("The largest number is: ${maxValue(4, 12)}")
}