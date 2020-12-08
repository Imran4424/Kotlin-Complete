// 1.2.3 + 2.3.4 + 3.4.5 + ... + n(n+1)(n+2)


fun main(args: Array<String>) {
    // FOR loop

    // taking int input from console
    val number: Int = readLine()!!.toInt()
    var sum: Int = 0

    for ( (i, j) in (0..number + 1).zip(0..number + 2)){
        println("values are: $i, $j")

        sum += (i * j)
    }

    println("Series sum is: $sum")
}