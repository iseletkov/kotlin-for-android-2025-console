package ru.psu.kotlin2025

class CPerson (val name : String){

    companion object {

        // свойства и методы companion-объекта
        const val MAX_AGE = 100
        fun sayHello123(){
            println("Hello, это статический метод, не зависит от конкретных экземпляров.")
        }
    }

    fun sayHello(){
        println("Hello, my name is $name")
    }

    init {
        println("Создаётся экземпляр класса Person с именем $name")
    }


    var age: Int = 18
        set(value){
            if((value>0) and (value < 110))
                field = value
        }
        get(){
            println("Call getter")
            return field
        }

    val ageStr : String
        get() = "${age} лет"


}