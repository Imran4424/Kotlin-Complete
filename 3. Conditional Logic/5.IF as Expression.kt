

fun main(args: Array<String>) {
    val numberOne = 17
    val numberTwo = 12

    var largest = if (numberOne > numberTwo) {
                        // always get the last statement
                        println(numberOne)
                        numberOne
                    } else {
                        // always get the last statement 
                        println(numberTwo)
                        numberTwo
                    }

    println("Largest value is $largest")
}