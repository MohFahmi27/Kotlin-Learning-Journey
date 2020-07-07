/*
* EXTENSION FUNCTION MEAN ADDING NEW FUNCTIONALITY OF A CLASS
* THAT ALREADY EXIST
 */

// String in this part are the call receiver type or
// it could be name of the class
// IT COULD ALSO EXTENT FROM JAVA CLASS
fun String.removeFirstLastChar():String = this.substring(1, this.length-1)


fun main() {
    val myString = "Something Extraordinary"
    val result = myString.removeFirstLastChar()
    println("result : $result")
}