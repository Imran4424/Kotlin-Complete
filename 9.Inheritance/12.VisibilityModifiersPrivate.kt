import sun.security.util.Length

/*
* Visibility Modifiers
*
* public - by default all kotlin components(variable, property, class, function, method etc) are public
* If you do not specify any visibility modifier, public is used by default,
* which means that your declarations will be visible everywhere
* ----------------------------------------------------------------------------------------------------------------------
* internal
* internal is an alternative to Java’s package-private. internal means that the declarations are visible inside a module.
*
* A module in kotlin is a set of Kotlin files compiled together. modules can be: maven projects, gradle sets, files generated
* from an Ant task, or a IntelliJ IDEA module
*
* internal provides real encapsulation for the implementation details, while in
* Java’s package-private encapsulation could be broken. External code can define classes in the package you are trying to protect.
* ----------------------------------------------------------------------------------------------------------------------
* protected
* Declarations are only visible in its class and in its subclassess
* ----------------------------------------------------------------------------------------------------------------------
* private
* If you mark a declaration private, it will only be visible inside the file containing the declaration.
*
* In another word.
* With private declarations are only visible in the class as in Java but in Kotlin also in the file (top level declarations)
* where it is declared.
*
* Another difference is that in Kotlin outer classes do not see private nested (or inner) classes
* */

// this function private at top level
// so this function is private to this file
private fun add(x: Int, y: Int): Int {
    return x + y
}

// this main function is also by default public
fun main(args: Array<String>) {
    var box = Box(24, 12, 24)
    // can't access the following variable cause it is private within class
    // box.width = 12
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
