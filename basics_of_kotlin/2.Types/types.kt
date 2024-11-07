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

fun main(){
    // variablesWithType()
    variablesWithoutType()
}