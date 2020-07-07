/*
* 'open'means this class could be parent class
* in KOTLIN BY DEFAULT EVERY CLASS ARE FINAL
* WHICH MEAN IT CAN'T HAVE ANY SUB-CLASS
 */

open class Human(_name: String, _age: Int, _country: String) {

    init {
        println("====================")
        println("Name : ${_name}\nAge : ${_age}\nCountry = $_country")
    }

    /*
    * SAME AS CLASS FUNCTION BY DEFAULT ARE FINAL
    * SO ADD 'final' KEYWORD to make function could do OVERRIDE
     */
    open fun work() {
//        THIS WILL RUN BEFORE GET OVERRIDE
        println("this is base class work method.")
    }

}

class Student(_name: String, _age: Int, _country: String) : Human(_name, _age, _country) {
    init {
        println("Class : Student")
    }
//    THIS IS OVERRIDE EXAMPLE WHICH YOU MAKE
//    CHANGE OF METHOD FROM PARENT CLASS TO
//    ADAPT WHAT YOUR CLASS NEED IT.
    override fun work(){
//    'super' KEYWORD MEANS IT WILL RUN THE DERIVED
//    CLASS AND THEN RUN THE OVERRIDE VERSION.
        super.work()
        println("I'm working on my student homework")
    }
}

class Teacher(_name: String, _age: Int, _country: String): Human(_name, _age, _country) {
    init {
        println("Class : Teacher")
    }
    override fun work() {
        super.work()
        println("I'm working as evaluator to student")
    }
}

fun main() {
    val student = Student("maria", 20, "Indonesia")
    val teacher = Teacher("John", 40, "USA")
    student.work()
    teacher.work()
}
