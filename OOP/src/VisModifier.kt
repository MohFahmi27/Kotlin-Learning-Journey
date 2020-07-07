// VISIBILITY MODIFIER
open class ParentClass() {
    val age = 20
    private val name = "Ashley" // this will not visible in child class
    protected open val x = 12
}

// PRIVATE MODIFIER MEANS IT ONLY VISIBLE ONLY IN THIS
// FILE KOTLIN ONLY which is VisModifier.kt
private class SubClass() : ParentClass() {
//    WHEN OVERRIDE PROTECTED METHOD OR A PROPERTIES
//    FROM PARENT CLASS IT WILL AUTOMATICALLY
//    PROTECTED
    override val x = 123    // this is protected.
}