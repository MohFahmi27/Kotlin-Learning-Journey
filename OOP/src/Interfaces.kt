/*
* NOTE :
* INTERFACE ARE SIMILAR TO ABSTRACT CLASSES WITH ONE DIFFERENCE
* IT'S NOT MANDATORY FOR PROPERTIES OF AN ABSTRACT CLASS TO BE ABSTRACT
* OR PROVIDE ACCESSOR IMPLEMENTATIONS
* with that being said everything on interface class
* always have abstract property
 */

interface InterfaceClass {

//    INTERFACE CAN PROVIDE PROPERTY WITH ACCESSOR
//    IMPLEMENTATION, ex:
    val name: String
        get() = "John Doe"

    val age: Int  //this is abstract property

    fun hello() {
        println("Hello there little fella this is interface class!")
    }

    fun something(){
        // code something
    }

    fun foo() {
        println("first interface")
    }

}

interface SecondDemoInterface {
    fun foo(){
        println("second interface")
    }
}

class InterfaceSubClass : InterfaceClass, SecondDemoInterface {
    override val age: Int = 12

    override val name: String = "Something"

    override fun hello() {
        super.hello()
        println("this is sub-class")
    }

    override fun something() {
        println("something method")
    }

    override fun foo() {
        println("test")
    }

}

fun main() {
    val demo = InterfaceSubClass()
    println("property age : ${demo.age}\nproperty name : ${demo.name}")
    demo.hello()
    demo.something()
    demo.foo()
}