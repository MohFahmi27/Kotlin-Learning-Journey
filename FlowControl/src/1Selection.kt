import java.util.*

fun main() {
//    REMEMBER THAT IN KOTLIN
    /*
    * IF is an expression
    * So we could assign variable with if inside it
    * */

    val number = -10
    val result = if (number > 0) {
        "POSITIVE NUMBER"
    } else {
        "NEGATIVE NUMBER"
    }

    println(result)

//    ANOTHER EXAMPLE
    val reader = Scanner(System.`in`)
    val num: Int = reader.nextInt()
    val result2 = if (num % 2 == 0) "EVEN NUMBER" else "ODD NUMBER"
    println(result2)

}