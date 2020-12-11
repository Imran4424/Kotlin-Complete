

/*
* Inheritance
* */


fun main(args: Array<String>) {
    var dog = Dog()

    dog.color = "black and white"
    dog.breed = "Aslacian"
    dog.bark()
    dog.eat("Bread")

    println()

    var cat = Cat()

    cat.color = "Grey"
    cat.age = 3
    cat.meow()
    cat.eat("Fish")
}

/*
* following error gone by making the Animal class open
* This type is final, so it cannot be inherited from
*
* by default kotlin classes are public & final
* to make a class inheritable, we need to use open
* */
open class Animal {
    var color: String = ""

    fun eat(food: String) {
        println("Eating $food")
    }
}

/*
* changing it to constructor invocation the following error is gone
* This type has a constructor, and thus must be initialized here
* */
class Dog: Animal() {
    var breed:String = ""

    fun bark() {
        println("Bark")
    }
}

/*
* changing it to constructor invocation the following error is gone
* This type has a constructor, and thus must be initialized here
* */
class Cat: Animal() {
    var age: Int = 0

    fun meow() {
        println("Meow")
    }
}