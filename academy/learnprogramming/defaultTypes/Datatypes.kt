package academy.learnprogramming.defaultTypes

fun main(args: Array<String>) {
    // Numeric types in Kotlin default to the integer type. We don't need to specify
    // if we want to declare a number as an integer because it will default to the integer type
    val myInt = 10
    // This is unneccessary: val myInt: Integer = 10

    // Two different ways to declare a long variable. We must be explicit when we want to
    // declare long, short, or byte data types.
    val myLong = 22L
    val myLong2 : Long = 23

    // Kotlin doesn't automatically widen numbers. For example, in java, we could write
    /* int myInt = 10;
    *  long myLong = myInt
    *  Java can automatically wide then integer. However, in Kotlin this won't work. It
    *  can't automatically convert a int to a long */

    // This is how we convert between longs and ints in Kotlin
    val x = 10
    var y = 22L
    y = x.toLong()

    val myByte: Byte = 11
    var myShort: Short
    myShort = myByte.toShort()

    // If there are any floating point numbers in kotlin, they will default to the double type.
    var myDouble = 65.45
    println("Double is default floating type floating type: ${(myDouble is Double)}")

    // A few ways we can declare floating data types
    val myFloat = 838.849f
    println("This is a float: ${myFloat is Float}")

    // Another example that kotlin won't widen data types automatically, even between floating
    // and double types
    myDouble = myFloat.toDouble()


    // In Kotlin we can't assign numeric values to chars like we can in Java. We can't
    // treat characters like numbers like we can Java
    // Error: val myChar = 65
    val char = 'b'

    // How we convert chars to their decimal integer in character set
    val myCharInt = 65
    println(myCharInt.toChar())

    // Kotlin classes which have a corresponding Java primitive type (boolean , int, long)
    // will get converted to the Java primitive type at compile time by the Kotlin compiler.
    // Thus when we work with Java code in Kotlin we don't need to worry about casting
    val myBoolean = true // Java primitive 'boolean'
    val vacationTime = false

    val anything: Any
}
