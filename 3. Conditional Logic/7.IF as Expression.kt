

fun main(args: Array<String>) {
    val year: Int = 2006

    var isLeapYear:Boolean = if (year % 4 == 0) {
                                if (year % 100 == 0) {
                                    year % 400 == 0
                                } else {
                                    true
                                }
                            } else {
                                false
                            }

    println("Is $year a leap year?")
    println("answer: $isLeapYear")
}