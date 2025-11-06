package ru.psu.kotlin2025

data class CRawContact(
    val id: Int,
    val name: String?, // Имя может быть неизвестно
    val phone: String?, // Телефон может отсутствовать
    val email: String? = null, // Email опционален и по умолчанию null
    val company: String? = null // Компания опциональна
)