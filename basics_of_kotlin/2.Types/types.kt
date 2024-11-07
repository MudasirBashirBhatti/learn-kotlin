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


// unsigned integers have same properties as signed integers but not has sign so the 1 bit hold for sign also included in range 
fun unsignedIntFun(){
    val uByteVar:UByte = 32 //size = 1byte, range (0 to 2^8 - 1) since there are no negative (1 1 1 1 1 1 1 1 = 255) 
    val uShortVar:UShort = 324 //size=2byte, range(0 to 2^16 -1)..........
    val uIntVar:UInt=32432 //size = 4byte, range (0 to 2^32 -1 ).........
    val uLongVar: ULong = 324234 // size = 8byte, range(0 to 2^64 -1)......
}

fun main(){
    // variablesWithType()
    // variablesWithoutType()
    // inTypes()
    unsignedIntFun()
}