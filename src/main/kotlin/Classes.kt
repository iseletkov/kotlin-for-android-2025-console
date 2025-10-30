import ru.psu.kotlin2025.CBankAccount
import ru.psu.kotlin2025.CPerson




fun main() {

//    var age = CPerson.MAX_AGE
//    val tom2 = CPerson("Том 2")
//
//    CPerson.sayHello123()
//    tom2.sayHello()


    // Создаем счета
    val account1 = CBankAccount("123456789", "Иван Иванов", 1000.0)
    val account2 = CBankAccount("987654321", "Петр Петров", 500.0)

    // Выводим информацию о счетах
    println("=== Начальное состояние счетов ===")
    println(account1.getAccountInfo())
    println(account2.getAccountInfo())

    // Тестируем операции
    println("\n=== Операции со счетами ===")

    // Пополнение счета
    println("Пополнение счета 1 на 200: ${account1.deposit(200.0)}")
    println("Пополнение счета 1 на -200: ${account1.deposit(-200.0)}")

    // Снятие средств
    println("Снятие средств!")
    if (account1.withdraw(10.0)=="ОК") {
        println("Средства сняты успешно!")
    }
    println("Снятие со счета 1 150: ${account1.withdraw(150.0)}")
    println("Снятие со счета 1 -150: ${account1.withdraw(-150.0)}")
    println("Снятие со счета 1 1500: ${account1.withdraw(1500.0)}")
}

