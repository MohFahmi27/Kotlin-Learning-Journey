import java.math.BigInteger

fun main(args: Array<String>) {
    println("Factorial 3 is ${factorial(3)}")
}

// THIS FUNCTION GET FACTORIAL FROM n
fun factorial(n: Int): Long {
    return if (n == 1) n.toLong() else n * factorial(n - 1)
//    THIS PART CALL THE RECURSION

}

// TAIL RECURSION
/*
* TAIL RECURSION WILL CALCULATE RECURSIVE IN
* DIFFERENT APPROACH.
* TAIL RECURSION PERFORMED CALCULATION FIRST THEN RECURSIVE CALL
* HENCE THIS WILL AVOID THE RISK OF STACK OVERFLOW (to big computation)
* */
tailrec fun fibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) a else fibonacci(n - 1, b, a + b)
}