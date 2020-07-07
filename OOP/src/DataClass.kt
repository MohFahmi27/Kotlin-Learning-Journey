/*
* DATA CLASS ARE CLASSES THAT ONLY PURPOSE TO HOLD THE DATA
* JUST LIKE IN JAVA CALL POJO INSTEAD MAKING GETTER AND SETTER
* KOTLIN ALREADY HAVE CREATED AUTOMATICALLY, ALSO FUNCTION SUCH
* AS toString(), equals(), hashcode(), copy()
* */

data class User(val name: String, val age: Int, val address: String, val gender: String)

fun main() {
    val user1 = User("Samantha", 20, "In His Home", "Female")
    val user2 = user1.copy(name = "Jake", gender = "Male")

    println("user1\nname : ${user1.name}\nage : ${user1.age}\naddress : " +
            "${user1.address}\ngender : ${user1.gender}")
    println(user2.toString())

//    DESTRUCTURING DECLARATIONS
//    IF YOU WANT TO MAKE OBJECT PROPERTY INTO THE VARIABLE
    val nameUser1 = user1.component1()  // compiler generate this
//    you could have componentN().
    println("nameUser1 : $nameUser1")

    val (name, age, address, gender) = user2
    println("ageUser2 : $age")

}