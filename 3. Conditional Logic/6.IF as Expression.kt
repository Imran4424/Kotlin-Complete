

fun main(args: Array<String>) {
    val year: Int = 2004

    var isLeapYear:Boolean = if (year % 4 == 0) {
                                if (year % 100 == 0) {
                                    if (year % 400 == 0) {
                                        true
                                    } else {
                                        false
                                    }
                                } else {
                                    true
                                }
                            } else {
                                false
                            }

    println("Is $year a leap year?")
    println("answer: $isLeapYear")
}