/*
* THERE ARE TWO TYPE OF CONSTRUCTOR IN KOTLIN
* FIRST IS primary constructor that get written inside of parenthesis
* SECOND TYPE IS secondary constructor that get written inside constructor{} block
*   USUALLY second constructor use to extend a class that provides multiple constructors
*       that initialize the class in different way
 */
class Person(val nameEmployee: String, var age: Int, val address: String) {

//    INIT means that in this block will get run everytime
//    Person Class get initialized.
//    this block can be use for add logic into the constructor.
    init {
        println("========================")
    }
}

fun main() {
//    FIRST initialized Person Class
//    and this will run the init{} block
    val person1 = Person("Ahmad", 12, "In the Earth")
    println("person1 name : ${person1.nameEmployee} \nperson1 age : ${person1.age}" +
            "\nperson1 address : ${person1.address}")

//    SECOND initialized Person Class
    val person2 = Person("Someone", 24, "In The Country")
    println("person2 name : ${person2.nameEmployee} \nperson2 age : ${person2.age}" +
            "\nperson2 address : ${person2.address}")

}