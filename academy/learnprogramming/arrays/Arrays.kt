package academy.learnprogramming.arrays

import academy.learnprogramming.javacode.DummyClass

fun main() {
    // Declare and initialize an array of strings
    val names = arrayOf("John", "Jane", "Jill", "Joe")

    // Declare and initialize an array of longs
    val longs = arrayOf<Long>(1, 2, 3, 4)

    // Declare and initialize an array of integers
    val integers = arrayOf(1, 2, 3, 4)

    println(longs is Array<Long>)
    println(integers is Array<Int>)

    //println(longs[2])

    // Use a lambda expression to fill an array with the first 16 even integers. For each element
    // we multiply the element by two and then store that at the next index
    val evenNumbers = Array(16) { i -> i * 2}

    for (number in evenNumbers) {
        println(number)
    }

    // Initialize an array of size 100000 filled with integers 0 to 999999
    val lotsOfNumbers = Array(100000) { i -> i }

    // Initialize an array of a set size to all 0's
    val allZeros : Array<Int> = Array(35) { i -> 0}
    // Can also be written as Array(35) { 0 }

    // If we're going to assign the array to another object reference throughout the program, declare it as a
    // a var and then re-assign
    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)
    for (number in someArray) {
        println(number)
    }

    someArray = Array(6) { i -> (i+1) * 10}
    for (number in someArray) {
        println(number)
    }

    // We can mix the data types inside of an array unlike in Java
    val mixedArray = arrayOf(1, "hello", 5.44, 'b')
    for (element in mixedArray) {
        println(element)
    }

    println(mixedArray is Array<*>)

    // Notice that there's a bug with this code in Kotlin. This is because unlike when calling java methods
    // with Kotlin primitive types, when we're dealing with Kotlin collections objects like Arrays, we can't
    // easily pass the kotlin object into a java method and expect it to translate the type without us
    // doing extra work.
    //DummyClass().printNumbers(someArray)

    // We should use the array sublcass for the primitive type when we're calling java methods and passing
    // our arrays as parameters.

    // This code will initialize a kotlin array using intArrayOf() subclass from collections. However,
    // the kotlin compiler will convert myIntArray down to a primitive array of integers like in Java.
    // So here there will be no compiler error for type mismatch.
    val myIntArray = intArrayOf(3, 4, 14, 23, 5)
    DummyClass().printNumbers(myIntArray)

    // How do we declare an array in kotlin and give it a predefined size without initializing it?
    // The code below doesn't work because Kotlin thinks we're calling the Array constructor, where we
    // need to pass 2 parameters, the list of values and the size of the array.
    //var someOtherArray = Array<Int>(5)

    var array1: Array<Int>

    // When working with primitive arrays we can declare and initialize a kotlin array which will be
    // filled with 0's because the array is really a java primitive array under the hood
    var someOtherArray = IntArray(5)
    for(number in someOtherArray) {
        println(number)
    }

    // We can convert from kotlin object arrays to kotlin primitive arrays easily
    DummyClass().printNumbers(evenNumbers.toIntArray())

    // We can also convert from a kotlin primitive array to an array of typed integers (Objects)
    val convertedIntArray:Array<Int> = myIntArray.toTypedArray()
}