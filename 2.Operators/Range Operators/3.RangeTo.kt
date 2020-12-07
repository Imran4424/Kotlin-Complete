

fun main(args: Array<String>) {
    // this range contains values 10 9 8 7 6 5 4 3 2 1
    var rangOne = 10 downTo 1

    // this range contains values 10 8 6 4 2
    val rangeTwo = 10 downTo 1 step 2

    // this range contains values 9 7 5 3 2 1
    var rangeThree = 9 downTo 1 step 2

    // this range contains values 10 9 8 7 6 5 4 3 2 1
    var countDown = 10.downTo(1)

    // this range contains values 1 2 3 4 5 6 7 8 9 10
    var moveUp = 1.rangeTo(10)

    // we can also use in operator for searching a value in a range
    var isPresent:Boolean = 4 in rangeTwo
    println("Is 4 present in rangeTwo? $isPresent")

    isPresent = 5 in rangeTwo
    println("Is 5 present in rangeTwo? $isPresent")
}