import ru.psu.kotlin2025.CRawContact


fun findContactPhoneById(contactId: Int, list : List<CRawContact>): String
{
    val contact = list
        .find{ contact ->
            contact.id == contactId
        }
    contact ?: return "Контакт не найден"

    return contact.phone ?: "Телефон не указан"

}

fun main()
{
//    val numbers2: MutableList<Int> = mutableListOf<Int>()
//        .apply{
//            add(0)
//            add(1)
//        }
//        .apply {
//            add(2)
//            add(3)
//        }
//
//    for (n in numbers2){ println(n) }


//    val dictionary = mutableMapOf("red" to "красный", "blue" to "синий", "green" to "зеленый")
//    val yellow = dictionary.getOrPut("yellow"){"Not found"}
//    println(yellow)   // Not found
//    val yellow2 = dictionary.getOrPut("yellow"){"Not found 2"}
//    println(yellow2)   // Not found
//    val blue = dictionary.getOrDefault("blue"){"Not found"}
//    println(blue) //"синий"

//    val english = listOf("red", "blue", "green")
//    val russian = listOf("красный", "синий", "зеленый")
//    val words = english.zip(russian)
//
//    for(word in words)
//        println("${word.first}: ${word.second}")



    // Пример входящего списка
    val rawContactList: List<CRawContact> = listOf(
        CRawContact(1, "Анна Иванова", "+79123456789", "anna@mail.com", "Google"),
        CRawContact(2, null, "+79098765432", null, "Yandex"), // Контакт без имени
        CRawContact(3, "Петр Сидоров", null, "petr@yandex.ru"), // Контакт без телефона
        CRawContact(4, "Мария", null, null, null), // Контакт только с именем
        CRawContact(5, null, null, "ghost@mail.com"), // Контакт без имени и телефона (бесполезен)
        CRawContact(6, "Алексей", "+74951234567", "alexey@gmail.com", "JetBrains"),
        CRawContact(7, "Test 7", "+79123456789", "anna@mail.com", "Google"),
        CRawContact(8, "Test 8", "+79123456789", "anna@mail.com", "Google"),
        CRawContact(9, "Алексей 2", "+74951234567", "alexey@gmail.com", "JetBrains"),
    )



    val validContacts = rawContactList
        .filter { contact ->
            //Если имя пустое, элемент через фильтр пропускать не надо.
            contact.name?: return@filter false
            if (contact.name.isEmpty()) return@filter false

            //Если имя пустое, элемент через фильтр пропускать не надо.
            contact.phone?: return@filter false
            if (contact.phone.isEmpty()) return@filter false

            true
        }

    for (contact in validContacts)
        println(contact)

    rawContactList
        .map{ contact ->
            "${contact.name ?: "Имя не указано"}: ${contact.phone ?: "Телефон не указан"}"
        }
        .forEach { contactStr ->
            println(contactStr)
        }

    val contactsByCompany  = validContacts
        .groupBy { contact -> contact.company ?: "Без компании" }

    for (companyInfo in contactsByCompany)
    {
        println("${companyInfo.key}:")
        for (contact in companyInfo.value)
        {
            println("\t${contact.name}: ${contact.company}")
        }

    }

    println(findContactPhoneById(5, rawContactList))
}