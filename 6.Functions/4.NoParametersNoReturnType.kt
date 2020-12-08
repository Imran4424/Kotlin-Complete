
/*
* function
* no parameters and no return type
* */

fun add() {
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()

    println("Result is: ${ x + y}")
}

fun main(args: Array<String>) {
    add()
}