
/*
* function
* with parameters and return type
* */

fun add(x: Int, y: Int): Int {
    return  x + y
}

fun main(args: Array<String>) {
    val numOne = readLine()!!.toInt()
    val numTwo = readLine()!!.toInt()

    val result = add(numOne, numTwo)

    println("Result is: $result")
}