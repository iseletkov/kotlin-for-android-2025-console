fun main() {
//    for (i in 1..9) {
//        for (j in 1..9) {
//            print("${i * j} \t")
//        }
//        println()
//    }
//    var i = 10
//    while(i > 0){
//        println(i*i)
//        i--;
//    }

//    val x : Int = try {
//        readLine()?.toInt()?:0
//    }
//    catch(e: NumberFormatException)
//    {
//        println("Надо вводить целое число!")
//        return
//    }
    println("Введите целые числа для суммирования. В конце ввода укажите любую нечисловую строку:")
//    var x : Int?
//    var sum = 0
//    do {
//        x = readLine()?.toIntOrNull()
//        if (x==null)
//            break
//        sum += x
//    }
//    while (true)
//
//    println("Сумма: $sum")
//    var x : Int?
//    var sum = 0
//    x = readLine()?.toIntOrNull()
//    while(x!=null)
//    {
//        sum += x
//        x = readLine()?.toIntOrNull()
//    }
//    println("Сумма: $sum")

    println("Введите целые числа для суммирования. В конце ввода укажите любую нечисловую строку:")
    var x : Int?
    var sum = 0
    while (readlnOrNull()?.toIntOrNull().let { sum += it?:0 } != null){}
    println("Сумма: $sum")

    var ggg = 123
    while(true)
    {
        ggg = 123
        println()
    }
}