package academy.learnprogramming.nullReferences1

fun main() {
    // If we're absolutely sure that the nullable data type we're working with won't ever be
    // null, we can follow a nullable expression with two exclamation marks.

    val str: String? = "This isn't null!"

    // Here the compiler wants us to use a question mark around the variable because we've defined it
    // as a null type
    // syntax error: println(str.toUpperCase())

    println(str!!.toUpperCase())
    // Here we force the toUpperCase() method on the str nullable variable with the two exclamation marks
    // which tells the Kotlin compiler we're 100% sure the variable won't be null. This prevents us from
    // having to write an if/else block to check if the variable is indeed null or not.
    // if (str == null) {
    //    throw exception()
    //} else {
    //    println(str.toUpperCase())
    //}

    // Ways in which we can get NPE's in Kotlin
    val str1: String? = null
//    val str2 = str1!! // Null pointer exception is thrown on this line so the line of code below
//    // will never execute.
//    val str3 = str2.toUpperCase()

    val str2: String? = "this isn't null"
    // This code below is bad practice! Don't do it! We will get an exception thrown in the printText function
    // which will make it look like our function handles null wrong, but instead it was the code on the line below
    // that masked itself as not having a null value to get around a syntax error of nullable vs.
    // non-nullable types.
    //printText(str2!!)

    // What we want to have happen is
    /*
    * if (str2 != null) {
    *   printText(str2)
    * }
    *   */

    str2?.let{ printText(it) }
    // The let keyword lets us pass in a lambda expression to check whether or not a nullable variable
    // exists or not, and then execute a function if the variable isn't null. If the str2 variable evaluates to
    // null, then the lambda expression won't execute. So what essentially happens is that the let function
    // uses the object that calls it as the parameter into the lambda.

    val str4: String? = null
    val str5 = "Hello"
    // The double equals operator in Kotlin is a safe operator so we don't have to worry about null
    // when comparing two objects here like we would in Java
    println("Will this result in a NPE? ${str4 == str5}")
}

fun printText(text: String) {
    println(text)
}