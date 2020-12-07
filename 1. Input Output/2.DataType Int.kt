

fun main(args: Array<String>) {
    // Integer type variable declaration

    // variable type is Int
    // variable type is determined by initialization value
    var number = 10

    var anotherNumber: Int

    anotherNumber = 20

    // string interpolation using concatenation
    println("The integer values are " + (number) + ", " + (anotherNumber))

    // string interpolation using $ sign
    // this is much user friendly
    println("The integer values are $number, $anotherNumber")

    // the following lines will generate error
    // cause we are trying to assign Int variable with double value
//    number = 20.0
//    anotherNumber = 20.0
}