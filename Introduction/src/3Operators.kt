fun main() {
    val num1 = 12.14
    val num2 = 4.5
    var result:Double

    println("========ARITHMETIC OPERATORS===========")
//    addition
//    UNDER THE HOOD CALL METHOD num1.plus(num2)
    result = num1 + num2
    println("num1 + num2 = $result")

//    subtraction
    result = num1 - num2
    println("num1 - num2 = $result")

//    multiplication
    result = num1 * num2
    println("num1 * num2 = $result")

//    division
    result = num1 / num2
    println("num1 / num2 = $result")

//    modulus
    result = num1 % num2
    println("num1 % num2 = $result")


    /*
    * ANOTHER EXAMPLE IS OPERATOR ASSIGNMENT
    * a = a + b
    * UNDER THE HOOD a.plusAssign(b)
    * a = a % b
    * UNDER THE HOOD a.divAssign(b)
    * */

    println("========PREFIX OPERATORS===========")
//   PREFIX INCREMENT / DECREMENT
//    UNDER THE HOOD CALL METHOD a.unaryPlus()
//    THIS CHANGE NEGATIVE TO POSITIVE
    result = +result
    println("+num1 = $result")

//    UNDER THE HOOD CALL METHOD a.inc()
//    THIS INCREASES VALUE RESULT BY 1
    result = ++result
    println("+num1 = $result")

    /*
    * ANOTHER EXAMPLE OF PREFIX OPERATOR
    * -result, Unary Minus
    * !result, not THIS FOR THE BOOLEAN TYPE
    * --result, DECREMENT
     */


}