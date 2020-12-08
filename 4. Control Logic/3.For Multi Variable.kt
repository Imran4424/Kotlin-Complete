// 1.2 + 2.3 + 3.4 + ... + n(n+1)


fun main(args: Array<String>) {
    // FOR loop

    // taking int input from console
    val number: Int = readLine()!!.toInt()
    var sum: Int = 0

    for ((i, j) in sequence { yieldAll(1..number) }.zip(sequence { yieldAll(2..number + 1) })) {
        println("values are: $i, $j")

        sum += (i * j)
    }

    println("Series sum is: $sum")
}