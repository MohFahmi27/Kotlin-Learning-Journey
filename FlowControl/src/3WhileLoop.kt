import java.util.*

fun main() {
    var i = 0
    val reader = Scanner(System.`in`)
    val limitLoop: Int = reader.nextInt()

    while(i <= limitLoop) {
        if (i % 2 == 0) {
            println("Number $i is EVEN")
            ++i
        }
        else {
            println("Number $i is ODD")
            ++i
        }
    }

}