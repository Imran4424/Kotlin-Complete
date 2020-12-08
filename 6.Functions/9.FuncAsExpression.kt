
/*
* function
* as expression
* */

fun maxValue(x: Int, y: Int): Int = if ( x > y) {
                                        println("$x greatest")
                                        x
                                    } else {
                                        println("$y greatest")
                                        y
                                    }

fun main(args: Array<String>) {
    println("The greatest number is: ${maxValue(4, 12)}")
}