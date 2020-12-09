// 0 1 1 2 3 5 8 13 21 34 55 89...

import java.math.BigInteger

/*
* function
*
* recursive function
* */

fun fibonacci(num: Int, seedOne: BigInteger, seedTwo: BigInteger) : BigInteger {
    if (num == 0) {
        return seedOne
    }

    return fibonacci(num - 1, seedTwo, seedOne + seedTwo)
}

fun main(args: Array<String>) {
    var num: Int = readLine()!!.toInt()

    println("The $num-th fibonacci number is ${fibonacci(num, BigInteger("0"), BigInteger("1"))}")
}


/*
*   This is a fibonacci recursive program
*
*   on input value 10000 this will crash because of stack overflow
* */