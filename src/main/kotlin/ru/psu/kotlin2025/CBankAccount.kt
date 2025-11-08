package ru.psu.kotlin2025

class CBankAccount(
    private var accountNumber: String = "000000000", // - номер счета (только для чтения, задается при создании)
    private var ownerName: String = "",//- имя владельца (можно изменить)
    private var balance: Double = 0.0,//- текущий баланс (можно изменить только внутри класса)
    private var isActive: Boolean = true// - статус счета (активен/заблокирован)
)
{
    //возвращает строку с полной информацией о счете
    fun getAccountInfo(): String {
        return "Счет: $accountNumber\nВладелец: ${ownerName}\nБаланс: ${balance}\nСтатус: ${if (isActive) "активен" else "заблокирован"}\n"
    }

//    - пополнение счета.
//    Возвращает true при успешной операции.
//    Нельзя пополнить на отрицательную сумму или если счет заблокирован.
    fun deposit(amount: Double): Boolean
    {
        if (amount<0)
            return false
        if (!isActive)
            return false
        balance += amount

        return true
    }
//    снятие средств. Возвращает true при успешной операции. Нельзя снять средства, если сумма превышает баланс, указана отрицательная сумма или счет заблокирован.
    fun withdraw(amount: Double): String
    {
        if (amount<0)
            return "Сумму не должна быть отрицательной!"
        if (!isActive)
            return "Счёт заблокирован!"
        if (amount>balance)
            return "Недостаточно средств на счёте!"
        balance -= amount
        return "ОК"
    }

}