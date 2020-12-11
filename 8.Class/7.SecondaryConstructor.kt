

/*
* Class
* */


fun main(args: Array<String>) {
    // class variable declaration
    var box: Box = Box(10, 12, 20, "Cuboid")

    println("Box area is: ${box.area()}")
    println("Box volume is: ${box.volume()}")
}

// class declaration
/*
* Here, we are defining property through primary constructor
* and it is initializing by passing parameters
*
* there's no need do anything in init for initialization
* */

class Box(var length: Int, var width: Int, var height: Int) {
    var shape: String = "nil"

    // init function can access both property and constructor parameter
    init {
        // accessing property values
        println("Length $length")
        println("Width $width")
        println("Height $height")
        println("Shape: $shape")
        println()
    }

    // secondary constructor declaration
    constructor(length: Int, width: Int, height: Int, shape: String): this(length, width, height) {
        this.shape = shape

        println("Length $length")
        println("Width $width")
        println("Height $height")
        println("Shape: $shape")
    }

    // class method declaration
    fun area(): Int {
        return  length * width
    }

    // class method declaration
    fun volume(): Int {
        return  length * width * height
    }
}
