1. val is like constant we cannot reassign it a value
2. we can reassign value to var 
fun main(){
    val pi = 3.14
    var num = 10

    println(pi)
    println(num)

    // pi=3.145  //this will give error
    num = 11  //this will be changed to 11 from 10
    println(pi)
    println(num)
}