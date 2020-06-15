package academy.learnprogramming.nullReferences1

fun main() {
    /* When we're dealing with primitive arrays in Kotlin, we don't need to worry about runnning into NPE
    * because the compiler will fill the array with values for us. When dealing with arrays of objects,
    * there is the danger of getting a NPE if we don't initializing anything. This is why we use the array of
    * nulls function is used which will tell the compiler we have an array filled with nullable types */
    val nullableInts = arrayOfNulls<Int?>(5)
    for (i in nullableInts) {
        println(i)
    }
    // The toString() operator will use the safe operator here under the covers before calling the toString() method
    println(nullableInts[3].toString())
}