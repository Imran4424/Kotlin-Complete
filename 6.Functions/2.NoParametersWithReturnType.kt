
/*
* function
* no parameters and with return type
* */

fun add(): Int {
    val numOne = readLine()!!.toInt()
    val numTwo = readLine()!!.toInt()

    return  numOne + numTwo
}

fun main(args: Array<String>) {
    println("Result is: ${add()}")
}