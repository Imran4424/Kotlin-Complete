

/*
* Class
* */


fun main(args: Array<String>) {
    // class variable declaration
    var box: Box = Box(10, 12, 20)

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
    // there' no need of following property now
    // these will only generate error
//    var length: Int = 0
//    var width: Int = 0
//    var height: Int = 0

    // init function can access both property and constructor parameter
    init {
        // init block
        // there's no need of initialization
        // cause it's already initialized in primary constructor
//        this.length = length
//        this.width = width
//        this.height = height

        // accessing property values
        println("Length $length")
        println("Width $width")
        println("Height $height")
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
