// ABSTRACT CLASS IN KOTLIN
// THIS IS EXAMPLE OF ABSTRACT
abstract class Car(_series: String) {
    private val series = _series

    init {
        println("THIS IS ABSTRACT CLASS")
    }

//    you could place non abstract method
//    inside the abstract class
    fun displayInfo() {
        println("Series : $series")
    }

//    THIS IS ABSTRACT METHOD THAT MUST OVERRIDE
//    IN THE SUB-CLASS OR CHILD CLASS
//    abstract already could derive so we don't need
//    'open' keyword explicitly
    abstract fun displayDesc(information: String)
}

class Mercedes(series: String) : Car(series) {

    override fun displayDesc(information: String) {
        println("Information : $information")
    }

}

fun main() {
    val car1 = Mercedes("type x")
    car1.displayInfo()
    car1.displayDesc("has 4 amazing tire")
}