// 1.3.5.7 + 3.5.7.9 + 5.7.9.11 + ... + n(n+2)(n+4)(n+6)


fun main(args: Array<String>) {
    // taking int input from console
    val number: Int = readLine()!!.toInt()
    var sum: Int = 0

    // here second variable iPair becomes pair because of first nested zip
    // here second variable jPair becomes pair because of second nested zip
    for ( (iPair, jPair) in ((1..number step 2).zip(3..number + 2 step 2)).zip((5..number + 4 step 2).zip(7..number + 6 step 2))) {
        println("values are: ${iPair.first}, ${iPair.second}, ${jPair.first}, ${jPair.second}")

        sum += (iPair.first * iPair.second * jPair.first * jPair.second)
    }

    println("Series sum is: $sum")
}