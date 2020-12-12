

/*
* Inheritance
* */


fun main(args: Array<String>) {
    var dog = Dog("Black and White", "Aslacian")

    dog.bark()
    println(dog.color)
    dog.eat("Bread")
}

/*
* following error gone by making the Animal class open
* This type is final, so it cannot be inherited from
*
* by default kotlin classes are public & final
* to make a class inheritable, we need to use open
* */
open class Animal(color: String) {
    var color: String = "White"

    init {
        this.color = color
    }

    open fun eat(food: String) {
        println("Animal Eating $food")
    }
}

/*
* changing it to constructor invocation the following error is gone
* This type has a constructor, and thus must be initialized here
* */
class Dog(color: String, breed: String): Animal(color) {
    var breed:String

    init {
        this.breed = breed
    }


    fun bark() {
        println("Bark")
    }

    override fun eat(food: String) {
        super<Animal>.eat(food)
        println("Dog Eating $food")
    }
}

/*
* changing it to constructor invocation the following error is gone
* This type has a constructor, and thus must be initialized here
* */
class Cat(color: String, age: Int): Animal(color) {
    var age: Int

    init {
        this.age = age
    }

    fun meow() {
        println("Meow")
    }

    override fun eat(food: String) {
        println("Dog Eating $food")
    }
}