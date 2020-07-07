class Lamp() {
//    this is attr of class
    private var lampStatus: Boolean = false

//    this is method of class
//    kotlin have 4 visibility modifiers
//    PUBLIC, PRIVATE, INTERNAL, PROTECTED
//    INTERNAL can only be seen by the same module.
    fun turnOn() {
        lampStatus = true
    }

//    DEFAULT modifier is Public
    fun turnOff() {
        lampStatus = false
    }

    fun displayLampStatus(lampName: String): String {
        return "$lampName $lampStatus"
    }

}

fun main() {
    val lam1 = Lamp()
    val lam2 = Lamp()
    lam2.turnOn()
    lam1.turnOn()
    lam1.turnOff()
    println(lam1.displayLampStatus("lam1"))
    println(lam2.displayLampStatus("lam2"))
}