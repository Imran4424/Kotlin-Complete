

fun main(args: Array<String>) {
    // this range contains values 1 2 3 4 5 6 7 8 9 10
    var rangOne = 1..10

    // this range contains values 1 3 5 7 9
    val rangeTwo = 1..10 step 2

    // this range contains values 2 4 6 8 10
    var rangeThree = 2..10 step 2

    // this range contains values from 'a' 'b' 'c' 'd' 'e' ... 'z'
    var rangeFour = 'a'..'z'

    // we can also use in operator for searching a value in a range
    var isPresent:Boolean = 'i' in rangeFour
    println("Is 'i' present in rangeFour? $isPresent")
}