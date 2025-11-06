fun test(str : String)
{
    println(str)
}
//fun mylength(str : String?) : Int
//{
////    str ?:  return 0
//
//    return str?.length?:0
//}

data class Person(val name: String, val email: String?)

data class Employee(var name: String = "", var age: Int = 0, var company: String = "") {
    fun age(_age: Int): Employee = apply { age = _age }
    fun name(_name: String): Employee = apply { name = _name }
    fun company(_company: String): Employee = apply { company = _company }
}

fun main()
{
//    var tst : String? = "alkwdal;wdlawdla"
//    test(tst ?: "Undefined")
//
//    tst = null
//    test(tst ?: "Undefined")

//    println(mylength(null))
//    println(mylength("ad ada da"))

//    val sam = Person("Sam", "adadadada dad")
//    sam
//        .email
//        ?.let{ emailNotNull ->
//            println("Email: $emailNotNull")
//            println("Email: $emailNotNull")
//            println("Email: $emailNotNull")
//        }     // Email: sam@gmail.com


// Так лучше делать, в параллельном потоке значение sam.email может быть изменено на null
//    if (sam.email!=null)
//    {
//        var x = 123+456
//        println("Email: ${sam.email}")
//        println("Email: ${sam.email}")
//        println("Email: ${sam.email}")
//    }

//    val bob = Employee()
//        .name("Bob")
//        .age(26)
//        .company("JetBrains")
//
//    println("${bob.name} (${bob.age}) - ${bob.company}") // Bob (26) - JetBrains

    var x : Int? = null

    x?.let{
        println("Переменная не пустая")
    }?:run {
        println("Переменная пустая")
    }
}