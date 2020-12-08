
/*
* function
* with parameters and return type
* */

fun add(x: Int, y: Int) {
    println("Result is: ${ x + y}")
}

fun main(args: Array<String>) {
    val numOne = readLine()!!.toInt()
    val numTwo = readLine()!!.toInt()

    add(numOne, numTwo)
}