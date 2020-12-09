
/*
* function
* Default parameters
* */

fun volume(length: Int = 10, width: Int = 5, height: Int = 15): Int {
    return  length * width * height
}

fun main(args: Array<String>) {
    println("Volume is: ${volume()}")
    println("Volume is: ${volume(7)}")
    println("Volume is: ${volume(5, 3)}")
    println("Volume is: ${volume(15, 7, 20)}")
}