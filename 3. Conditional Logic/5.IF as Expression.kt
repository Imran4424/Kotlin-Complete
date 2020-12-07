

fun main(args: Array<String>) {
    val numberOne = 17
    val numberTwo = 12

    var largest = if (numberOne > numberTwo) {
                        numberOne
                    } else {
                        numberTwo
                    }

    println("Largest value is $largest")
}