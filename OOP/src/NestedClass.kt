// KOTLIN NESTED AND INNER CLASS
class Outer {
    val propertyOuter = "This is Property Outer Class"

    class Nested {
//        HOWEVER NESTED CLASS CAN'T ACCESS PROPERTY OR METHOD
//        IN OUTER CLASS
        val propertyNested = "This is Property Nested Class"
        fun hello() = "nested class function!"
    }

}

class OuterSecond {
    val a = 10
//    IF WE USING 'inner' KEYWORD THIS WILL MAKE
//    NESTED SECOND CLASS TO ACCESS PROPERTY OR METHOD
//    IN OUTER CLASS
    inner class NestedSecond {

    }
}

fun main() {
    println(Outer.Nested().hello())

//    THIS WAY
    val outer = Outer()
    println(outer.propertyOuter)

//    ANOTHER WAY TO CALL PROPERTY OR METHOD IN NESTED CLASSES
    val outerNestedObj = Outer.Nested()
    println(outerNestedObj.propertyNested)
}