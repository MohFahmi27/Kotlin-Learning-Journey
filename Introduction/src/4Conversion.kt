fun main() {
    val number1: Int = 54344
//    KOTLIN DOESN'T CONVERT NUMERIC VALUE AUTOMATICALLY
//    YOU HAVE TO DECLARE toBtye(), toInt(), etc
//    EX :
    val number2: Byte = number1.toByte()
    println("number 1 : $number1")
    println("number 2 : $number2")
}