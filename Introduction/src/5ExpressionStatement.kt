fun main() {
//    ->EXPRESSION CONSIST OF VARIABLES, OPERATORS
//    THAT EVALUATES TO SINGLE VALUE
//    ->STATEMENT ARE EVERYTHING THAT MAKE UP A COMPLETE
//    UNIT OF EXECUTION
//    EX:
    val score = 40 + 23
//    40 + 23 ARE THE EXPRESSION
//    val score = 40 + 23 ARE THE STATEMENT

    /*
    * ->IMPORTANT
    * IF IN KOTLIN IS A STATEMENT
    * EX:
     */
    val a = 12
    val b = 13
    val max:Int

    max = if (a > b) a else b
    println("$max")

}
