package academy.learnprogramming.nullReferences1

fun main() {
    // This code below will result in a syntax error. Why? Kotlin has the idea of nullable types.
    //val str: String = null

    // The variable str is defined as a null type whether or not the actual value is null
    val str: String? = null
    val nnStr: String? = "This isn't null!"

    // At this point the variable nnStr won't have access to most string methods from the String class
    // because we've told the compiler that this variable could be null.

    // Here we can use string methods on the nullable variable nnStr because we first check to see if the
    // variable is storing null.
    if (nnStr != null) {
        nnStr.toUpperCase()
    }

    // Kotlin has the safe access expressions to protect us from NPE's.
    // The code is the same as above.
    println(nnStr?.toUpperCase()) // -> This isn't null!
    println(str?.toUpperCase()) // -> null

    // Here if the variable is null, we return null. Otherwise, we evaluate the epxression and return
    // an uppercased string

    // We can also chain nullable types together.
    // val countryCode: String? = bankBranch?.address?.country?.countryCode

    // What if we don't want to assign null back to the countryCode variable in the case that
    // one of our variables in the chain is null? WE can use the elvis operator

    val str2 = str ?: "This is the default value"
    println(str2)
    //There's not way that str2 will ever be null, so we don't need to declare it as a nullable type.
    // str2 will be assiged to the string value here if str is null

    // we can also use elvis operators at the end of our chain of nullable types.
    // val whatever = brankBranch?.address?.country ?: "US"

    // How to use the safe case operator in Kotlin
    val something: Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String
    println(str3)
    println(str3?.toUpperCase())
}