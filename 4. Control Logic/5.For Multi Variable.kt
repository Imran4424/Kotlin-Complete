// 1.2.3 + 2.3.4 + 3.4.5 + ... + n(n+1)(n+2)

fun main(args: Array<String>) {
    // taking int input from console
    val number: Int = readLine()!!.toInt()
    var sum: Int = 0

    // here second variable j becomes pair because of second nested zip
    for ( (i, jPair) in (1..number).zip((0..number + 1).zip(2..number + 2))) {
        println("values are: $i, ${jPair.first}, ${jPair.second}")

        sum += (i * jPair.first * jPair.second)
    }

    println("Series sum is: $sum")
}