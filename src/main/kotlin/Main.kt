package org.example

fun main() {

    val marti:Persona = Persona("Marti","Vilas")
    val ulises:Persona= Persona("41746226N ","Ulises", "Castell",89,false)
    println(Persona())
    println(marti)
    println(ulises)
    marti.setEdad(27)
    println("La edad de ${marti.getNom()} es "+marti.getEdad())



}