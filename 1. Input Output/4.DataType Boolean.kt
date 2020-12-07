

fun main(args: Array<String>) {
    // Boolean type variable declaration

    // variable type is Boolean
    // variable type is determined by initialization value
    var isRaining = false

    var isCycleRed: Boolean

    isCycleRed = true

    // string interpolation using concatenation
    println("Is is raining today?\nans:" + (isRaining) + "\nIs my cyle red?\nans: " + (isCycleRed))

    // string interpolation using $ sign
    // this is much user friendly
    println("Is is raining today?\nans:$isRaining\nIs my cyle red?\nans: $isCycleRed")

    // the following lines will generate error
    // cause we are trying to assign Double variable with Int value
//    isRaining = 0
//    isCycleRed = 25
}