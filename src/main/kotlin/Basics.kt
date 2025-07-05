

fun main() {
    // val : constant variable (상수 변수) / immutable / 변하지 않는 변수
    // var : mutable (변동 가능) 변수

    // val number1 = 1
    // number1 = 2 // error

    var myAge = 35
    println("myAge is $myAge")

    myAge = 36
    println("myAge is $myAge")

    var pi = 3.14
    println(pi)
    pi = 3.1415926535
    println(pi)

    var age: UShort = 35u
    println(age)

    val myTrue: Boolean = true
    val myFalse: Boolean = false

    println(myTrue || myFalse) // true
    println(myTrue && myFalse) // false
    println(!myTrue) // false

    val myChar = '\u00AE'
    println(myChar)

    val str = "abCd 123 한글"
    for(c in str){
        println(c)
    }

    println(str)
    println(str.lowercase())
    println(str.uppercase())
    println("$str \tpocaaaa")

    var age2 = 0

    // Comparison operations
    // greater than >
    // lower than <
    // greater equal >=
    // lower equal <=
    // equal ==

    println("Please enter your age as a full number")
    // read what the user has entered into the console
    val enteredValue = readln()

    // convert the string variable into an int variable
    age2 = enteredValue.toInt()

    // toInt : string to int convert
    //age2 = readln().toInt()

    if(age2 >= 40) {
        println("Your can not go into the club, please go home")
    } else if(age2 >= 18) {
        println("Your can go into the club")
    } else {
        println("Your are too young to go into the club!")
    }

    if(age2 in 18 .. 39) {
        println("Your can go into the club")
    } else if(age2 >= 40) {
        println("Your can not go into the club, please go home")
    } else {
        println("Your are too young to go into the club!")
    }
}