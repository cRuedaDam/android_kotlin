package com.example.recyclerview

//TODO 6: Creamos una classe que albergará un modelo de datos para crear el listado

//Las data clases son clases que requieren parámetros
//Son capaces de devolver getters y setters sin definirlos
data class SuperHero(
    val superhero: String,
    val publisher: String,
    val realName: String,
    val photo: String
)