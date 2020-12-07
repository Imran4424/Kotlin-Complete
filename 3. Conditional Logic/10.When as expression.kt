

fun main(args: Array<String>) {
    val digit = 7

    val digitSpelling:String = when (digit) {
                        // condition -> statement
                        0 -> "Zero"
                        1 -> "One"
                        2 -> "Two"
                        3 -> "Three"
                        4 -> "Four"
                        5 -> "Five"
                        6 -> "Six"
                        7 -> "Seven"
                        8 -> "Eight"
                        9 -> "Nine"
                        // default condition -> default statement
                        else -> "Not a digit"
                    }

    println(digitSpelling)
}