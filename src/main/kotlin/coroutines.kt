import kotlinx.coroutines.*
import ru.psu.kotlin2025.CUser
import java.util.UUID

suspend fun createReport(
    users : List<CUser>
)
{

    val avg =  users
        .onEach { delay(400L) }
        .map {user -> user.age}
        .average()

    println("Средний возраст всех пользователей: $avg")
}
fun outList()
{

}
fun addItem(users : MutableList<CUser>)
{

    users.add(CUser(UUID.fromString("43a47bb7-c124-44ca-bb3d-7223496b6925"), "Иванов", 20, "test@gmail.com"))
}
fun menu() : Int
{
    println("Выберите операцию:")
    println("1. Показать список")
    println("2. Добавить элемент")


    println("5. Подсчитать средний возраст")
    println("0. Выход из программы")

    while(true) {
        try {
            return readln().toInt()
        } catch (e: Exception) {
            println("Нужно указать число 1-5!")
        }
    }
}

fun main() = runBlocking{
    val users = mutableListOf<CUser>()


    users.add(CUser(UUID.fromString("cd9c88fa-f498-4532-a352-3230c91d52c6"), "Иванов", 30, "test@gmail.com"))
    users.add(CUser(UUID.fromString("b4266e5f-c65c-4d8f-81d1-9bf7231dd7f4"), "Иванов", 40, "test@gmail.com"))
    users.add(CUser(UUID.fromString("f02dbc8d-cd7d-49f9-86c2-7f830a9534a6"), "Иванов", 50, "test@gmail.com"))
    users.add(CUser(UUID.fromString("f89f8ba8-c66e-4e78-9567-9eab02738646"), "Иванов", 60, "test@gmail.com"))

    var command : Int
    while(true)
    {
        command = menu()
        when(command)
        {
            1 -> outList()
            2 -> addItem(users)
            5 -> {
                val job = launch {
                    createReport(users)
                }
                job.join()
            }
            0 -> return@runBlocking
        }

    }



    println("Конец программы")
    Unit
}

