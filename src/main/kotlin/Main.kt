fun main() {

//    print("Введите ваше имя: ")
//    val name = readlnOrNull()
//    print("Вы ввели: $name")

//    val a = -10
//    val b1 = a<-5
//    val b2 = a>100
//
//    println("Результат: ${b1 || b2}")

//    val a = 6
//    println("Результат: ${a in -5..5}")

//    val a = 0
//    if(a == 10) {
//        println("a равно 10")
//    }
//    else if(a == 9){
//        println("a равно 9")
//    }
//    else if(a == 8){
//        println("a равно 8")
//    }
//    else{
//        println("a имеет неопределенное значение")
//    }

//    val a = 20
//    val b = 10
//    val c = (
//        if (a > b) {
//            print("Промежуточный резултат 1");
//            print("флвотфцвотфл");
//            a+b
//        } else if (a < b) {
//            print("Промежуточный резултат -1");
//            -1
//        } else 0
//    ) * 20
//
//    println(c)  // 20

//    val isEnabled = true
//    when(isEnabled){
//        false -> println("isEnabled off")
//        true -> println("isEnabled on")
//    }
//    val b = 17+13
//    val a = 30
//    when(a){
//        10,15,18 -> println("a = 10 или 15 или 18")
//        20, 22, 23 -> println("a = 20,22,23")
//        in 10..20 -> println("в диапазоне от 10 до 20")
//        b -> println("a = 17 + 13")
//        else -> println("неопределенное значение")
//    }

//    val a = 10
//    val b = 26
//    when(val c = a + b){
//        10 -> println("a + b = 10")
//        20 -> println("a + b = 20")
//        else -> println("c = $c")
//    }

//    val day = 2
//    var dayOfweek = when (day) {
//        1 -> "Monday"
//        2 -> "Tuesday"
//        3 -> "Wednesday"
//        4 -> "Thursday"
//        else -> "Unknown"
//    }
//    println(dayOfweek)      // Tuesday

//    val test = true
//    var ret = when(test) {
//        true -> {
//            println("adawdawd")
//            println("adawdawd")
//            println("adawdawd")
//            10+20
//        }
//        false -> 0
////        else ->
//    }
//    println(ret)

//    var a = 10
//    val ret = when{
//        (a<0) -> "1"
//        (a>=0) ->"2"
//        else -> ""
//    }
//    println(ret)

    val x : Int = try {
        readLine()?.toInt()?:0
    }
    catch(e: NumberFormatException)
    {
        println("Надо вводить целое число!")
        return
    }
    println("x: $x")
}