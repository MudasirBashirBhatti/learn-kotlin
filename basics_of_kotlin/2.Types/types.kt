// there are 6 major types of variables
// Int, String, Double, Long, Boolean, Char

// function with variables type declaration
fun variablesWithType(){
    val counter_number: Int = 1000
    val firstName: String = "Mudasir"
    val piValue: Double = 3.14
    val longValue: Long = 100_100_1000
    val isBulbOn: Boolean = true
    val singleChar: Char = 'h'

    println(counter_number)
    println(firstName)
    println(piValue)
    println(longValue)
    println(isBulbOn)
    println(singleChar)
}

// function without variables type declaration
// if we not declare type in variable the type automatically(implicitly) assigned by kotlin
fun variablesWithoutType(){
    val counter_number = 1000
    val firstName = "Mudasir"
    val piValue = 3.14
    val longValue = 100_100_1000
    val isBulbOn = true
    val singleChar = 'h'

    println(counter_number.toString() + counter_number::class.simpleName)
    println(firstName + firstName::class.simpleName)
    println(piValue.toString() + piValue::class.simpleName)
    println(longValue.toString() + longValue::class.simpleName)
    println(isBulbOn.toString() + isBulbOn::class.simpleName)
    println(singleChar.toString() + singleChar::class.simpleName)
}

// further types of numeric data like integers
fun intTypes(){
    val byteVar:Byte = 32  //size = 1 byte, range (-2^7 to 2^7 - 1), 1 bit is for sign remain space for 7 bits as 1byte = 8bits
    val shortVar:Short = 2343 //size = 2byte, range (-2^15 to 2^15 - 1), 8*2 total 16bits 1 for sign remaining 15bits
    val intVar:Int = 23423424 // size = 4byte, range(-2^31 to 2^31 - 1) 8*4 total bits 32 1 for sign remaining 31bits
    val LongVar:Long = 234234324354 // size = 8byte, range(-2^63 to 2^63 - 1) 8*8 total bits 64 1 for sign remaining 63bits
}


// Unsigned integers have similar properties to signed integers, but they do not reserve a bit for the sign (positive/negative).
// This means that the range of unsigned integers includes only non-negative numbers, 
// and the "sign bit" in a signed integer is used to extend the positive range in unsigned integers.
// To explicitly define an unsigned integer in Kotlin, we need to use .toUByte(), .toUShort(), .toUInt(), or .toULong() to convert 
// regular integers to their unsigned counterparts.
fun unsignedIntFun(){
    val uByteVar:UByte = 32.toUByte() //size = 1byte, range (0 to 2^8 - 1) since there are no negative (1 1 1 1 1 1 1 1 = 255) 
    val uShortVar:UShort = 324.toUShort() //size=2byte, range(0 to 2^16 -1)..........
    val uIntVar:UInt=32432.toUInt() //size = 4byte, range (0 to 2^32 -1 ).........
    val uLongVar: ULong = 324234.toULong() // size = 8byte, range(0 to 2^64 -1)......

    println(uByteVar)
    println(uShortVar)
    println(uIntVar)
    println(uLongVar)
}


fun main(){
    // variablesWithType()
    // variablesWithoutType()
    // inTypes()
    unsignedIntFun()
}