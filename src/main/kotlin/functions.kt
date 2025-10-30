
//fun displayUser(name: String, age: Int){
//    println("Name: $name   Age: $age")
//}

fun displayUser(name: String, age: Int = 18, position: String="unemployed"){
    println("Name: $name   Age: $age  Position: $position")
}

fun showMessage(message: String){
    println(message)
}

//fun double(n: Int){
//    n = n * 2   // !Ошибка - значение параметра нельзя изменить
//    println("Значение в функции double: $n")
//}

fun double(numbers: IntArray){
    numbers[0] = numbers[0] * 2
    println("Значение в функции double: ${numbers[0]}")
}

fun printStrings(vararg strings: String){
    for(str in strings)
        println(str)
}

fun test(vararg strings: Any){
    for(str in strings)
        println(str)
}

fun printUserGroup(group: String, vararg users: String, count:Int){
    println("Group: $group")
    println("Count: $count")
    for(user in users)
        println(user)
}

fun changeNumbersA(vararg numbers: Int, koef: Int){
    for(number in numbers)
        println(number * koef)
}
fun changeNumbersB(numbers: IntArray, koef: Int){
    for(number in numbers)
        println(number * koef)
}

//fun sum(x:Int, y:Int): Int{
//    return x + y
//}

//fun square(x: Int) = x * x


fun square(x: Int) : Double = (x * x).toDouble()

fun compareAge(age1: Int, age2: Int){



    fun ageIsValid(age: Int): Boolean{
        return age > 0 && age < 111
    }


    if( !ageIsValid(age1) || !ageIsValid(age2)) {
        println("Invalid age")
        return
    }

    when {
        age1 == age2 -> println("age1 == age2")
        age1 > age2 -> println("age1 > age2")
        age1 < age2 -> println("age1 < age2")
    }
}

fun sum(a: Int, b: Int) : Int{
    return a + b
}
fun sum(a: Int, b: Double) : Double{
    return a + b
}
fun sum(vararg a: Int) : Int{
    var x = 0
    for(number in a)
       x += number
    return x
}

fun displayMessage(mes: () -> Unit){
    mes()
}
fun morning(){
    println("Good Morning")
}
fun evening(){
    println("Good Evening")
}

//fun Button(onClick: () -> Unit, onLayout: () -> Unit){
//
//    while(true) {
//        if (пользователь нажал)
//            onClick()
//    }
//}
//fun Button(onClick: () -> Unit){
//
//    while(true) {
//        if (пользователь нажал)
//            onClick()
//    }
//}

fun main()
{
//    displayUser("Tom",23, "Manager")
//    displayUser("Alice", 21)
//    displayUser("Kate")
//    displayUser("Kate", position="Middle Developer")
//    displayUser( position="Middle Developer", name="Kate", age=19)

//    var nums = intArrayOf(4, 5, 6)
//    double(nums)
//    println("Значение в функции main: ${nums[0]}")

//    printStrings("Tom", "Bob", "Sam")
//    printStrings("Kotlin", "JavaScript", "Java", "C#", "C++")
//    test("adawd", 10, 20.4, true)

//    printUserGroup("KT-091", "Tom", "Bob", "Alice", count=3)

//    val nums = intArrayOf(1, 2, 3, 4)
//    changeNumbersA(*nums, koef=2)
//    changeNumbersA(nums[0],nums[1],nums[2],nums[3], koef=2)
//    changeNumbersB(nums, koef=2)

//    val a = sum(4, 3)
//    val b = sum(5, 6)
//    val c = sum(6, 9)
//    println("a=$a  b=$b  c=$c")

//    val a = square(5)   // 25
//    val b = square(6)   // 36
//    println("a=$a  b=$b")

//    val a1 = 20
//    val a2 = 23
//    compareAge(a1, a2)

//    val x = sum(1,2,3,4,5)
//    val y = x + 1

//    displayMessage(::morning)
//    displayMessage(::evening)


//    val printer = {message: String ->
//        println(message)
//        println(message)
//    }
//    printer("Hello")
//    printer("Good Bye")

//    val sum = {x:Int, y:Int -> x + y}
//
//    val a = sum(2, 3)   // 5
//    val b = sum(4, 5)   // 9
//    println("a=$a  b=$b")

//    Button(onClick={println("Кнопка нажата")}) { Text(" Adad")}
//
//    Button {println("Кнопка нажата")}
}

