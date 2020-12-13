import sun.security.util.Length

/*
* Visibility Modifiers
*
* public - by default all kotlin components(variable, property, class, function, method etc) are public
* If you do not specify any visibility modifier, public is used by default,
* which means that your declarations will be visible everywhere
*
* internal
* protected
* private
* */

// this function is by default public
fun add(x: Int, y: Int): Int {
    return x + y
}

// this main function is also by default public
fun main(args: Array<String>) {

}

// this class is by default public
class Box(length: Int, width: Int, height: Int) {
    private var length: Int
    private var width: Int
    private var height: Int

    init {
        this.length = length
        this.width = width
        this.height = height
    }

    // this class is by default public
    fun area(): Int {
        return length * width
    }

    // this class is by default public
    fun volume(): Int {
        return length * width * height
    }
}
