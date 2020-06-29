/*
* THERE ARE TWO TYPE OF FUNCTION
* -> STANDARD LIBRARY FUNCTIONS OR DEFAULT FUNCTIONS
*    EX : print(), sqrt(), etc.
* -> USER DEFINED FUNCTIONS
*    FUNCTION THAT CREATED BY PROGRAMMER.
* */
fun main() {
    val num1 = 12
    val num2 = 13
    println("THIS IS ADD FUNC ${addNumber(num1, num2)}")
    println("THIS IS DOUBLE TYPE FUNC ${addNumberDouble(12.3, 32.2)}")
    println("THIS IS MULTIPLY NUM FUNC ${multiplyNumber(num1, num2)}")
    println("THIS IS DIVIDE NUM FUNC WITH DEFAULT ARGUMENT ${divideNumber()}")
    println("THIS IS DIVIDE NUM FUNC WITHOUT DEFAULT ARGUMENT ${divideNumber(10.0, 3.0)}")
    val evenConvert = EvenConvert()
    evenConvert evenNumber 20
    // 20 is n
    // infix will take parameter in right of function call
}

fun addNumber(a: Int, b: Int): Int {
    return a + b
}

// ONE LINE FUNCTION
fun multiplyNumber(a: Int, b: Int): Int = a * b

fun addNumberDouble(a: Double, b: Double): Double {
    return a + b
}

// DEFAULT ARGUMENT ON FUNCTION
fun divideNumber(a: Double = 12.0, b: Double = 2.0): Double {
    return a / b
}

/*
* INFIX FUNCTION
* EX : a and b
* -> 'and' is infix function which gonna have same thing as
* a.and(b)
* */
class EvenConvert() {
//    BECAUSE INFIX NOTATION CAN ONLY CALL WITH CLASS OBJECT
//    THAT'S WHY WE HAVE TO CREATED CLASS HERE.
    infix fun evenNumber(n: Int) {
        // INFIX FUNC MUST ONLY HAVE ONE PARAMETER
        for (i in 0..n) {
            if (i % 2 == 0) {
                println(i)
            }
        }
    }
}

