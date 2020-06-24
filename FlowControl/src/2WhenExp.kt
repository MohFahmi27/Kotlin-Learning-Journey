fun main() {
    print("Input the operator: ")
    val number1 = 12
    val number2 = 14
    val operator = readLine()
//  WHEN expression LIKE switch in JAVA
//  -> are lambda IN KOTLIN.
    val result = when(operator) {
        "+" -> number1 + number2
        "-" -> number1 - number2
        "*" -> number1 * number2
        "/" -> number1 / number2
        else -> "$operator Is not valid operator"
    }

    println("RESULT = $result")

}