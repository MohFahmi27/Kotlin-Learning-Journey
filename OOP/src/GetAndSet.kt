// BY DEFAULT KOTLIN ALREADY HAVE AUTO GENERATED
// GET AND SET METHOD. but this is optional thing to do.
class Employee {
//    this is property of Employee Class
    var age:Int = 0
//    field is property name
//    kotlin can detect under the hood using
//    field keyword
    get() = field

    set(value){
        field = if (value < 18)
            18
        else if (value in 18..30)
            value
        else
            value-3
    }

    var actualAge: Int = 0
}

fun main() {
    val denise = Employee()
//    this is the setter
//    usually setter use equal(=) to tell the difference
//    between getter and setter
    denise.age = 15
    denise.actualAge = 14

//    this is the getter
    println("${denise.actualAge}")
    println("${denise.age}")
}