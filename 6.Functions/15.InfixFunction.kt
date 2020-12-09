
/*
* function
*
* extension function
* infix function
* */

// class declaration
class Box {
    fun area(length: Int, width: Int): Int {
        return length * width
    }
}

// extension function of Box class
// but not an infix function of Box class
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

    // infix function calling feature
    // for calling this way
    // we must need to include infix keyword before one parameter function
    println(numOne greaterValue numTwo)

    println(26 greaterValue 15)
}

// this will show error
// cause infix functions only have one parameter
//infix fun String.add(str1: String, str2: String): String {
//    return  this + str1 + str2
//}

// this is an extension function
// but not an infix function
fun String.add(str1: String, str2: String): String {
    return  this + str1 + str2
}

// this is an extension function
// also it a infix function cause it has only one parameter
infix fun Int.greaterValue(x: Int): Int {
    if (this > x) {
        return this
    }

    return x
}

/*
* 1. All infix functions are extension function
*    but all extension function are not infix
*
* 2. infix functions just have one parameter
* */