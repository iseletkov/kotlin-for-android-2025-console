package ru.psu.kotlin2025

import java.util.UUID


data class CUser (
    var id : UUID,
    var name : String,
    var age : Int,
    var email : String
)