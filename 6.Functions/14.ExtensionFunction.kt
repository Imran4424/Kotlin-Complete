
/*
* function
* Named parameters
*
* extension function
* */

// class declaration
class Box {
    fun area(length: Int, width: Int): Int {
        return length * width
    }
}

// extension function of Box class
fun Box.volume(length: Int, width: Int, height: Int): Int {
    return length * width * height
}

fun main(args: Array<String>) {
    var box: Box = Box()

    println("Area is: ${box.area(7, 2)}")
    println("Volume is: ${box.volume(7, 2, 15)}")

    var textOne: String = "I love to play "
    var textTwo: String = "games."
    var textThree: String = "Don't you know? "

    println(textThree.add(textOne, textTwo))

    val numOne: Int = 6
    val numTwo: Int = 12

    println(numOne.greaterValue(numTwo))
}

fun String.add(str1: String, str2: String): String {
    return  this + str1 + str2
}

fun Int.greaterValue(x: Int): Int {
    if (this > x) {
        return this
    }

    return x
}