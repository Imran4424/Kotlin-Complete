

fun main(args: Array<String>) {
    // Double type variable declaration

    // variable type is Double
    // variable type is determined by initialization value
    var number = 10.25

    var anotherNumber: Double

    anotherNumber = 20.35

    // string interpolation using concatenation
    println("The double values are " + (number) + ", " + (anotherNumber))

    // string interpolation using $ sign
    // this is much user friendly
    println("The double values are $number, $anotherNumber")

    // the following lines will generate error
    // cause we are trying to assign Double variable with Int value
//    number = 5
//    anotherNumber = 25
}