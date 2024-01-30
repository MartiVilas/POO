package org.example

fun main() {

   /* Exercici 1
    val marti:Persona = Persona("Marti","Vilas")
    val ulises:Persona= Persona("41746226N ","Ulises", "Castell",89,false)
    println(Persona())
    println(marti)
    println(ulises)
    marti.setEdad(27)
    println("La edad de ${marti.getNom()} es "+marti.getEdad())
    */


    /**
     *  Exercici 2, Fer un petit menú d'usuari amb les següents opcions:
     * 1.- Crear un cercle d'un radi determinat i d'un color determinat
     * 2.- Crear un cercle d'un radi determinat
     * 3.- Mostrar últim cercle creat
     * 4.- Mostrar perímetre últim cercle creat
     * 5.- Mostrar àrea últim cercle creat
     * 6.- Sortir
     * @author Marti Vilas
     * @since 30/01
     */

    var ultimCercle:Cercle

    do {
        println("1. Crear un cercle d'un radi determinat i d'un color determinat")
        println("2. Crear un cercle d'un radi determinat")
        println("3. Mostrar l'ultim cercle creat")
        println("4. Mostrar el perímetre de l'últim cercle creat")
        println("5. Mostrar l'àrea de l'últim cercle creat")
        println("6. Sortir")

        val opcioUsuari: Int = readInt("","Tipus dades incorrecte.",
            "Valor fora del rang esperat.",1,6 )
        when(opcioUsuari) {
            1 -> ultimCercle = crearCercleDeterminat()
        }

    } while (opcioUsuari != 6)
}


fun crearCercleDeterminat(): Cercle {
    val radi: Float = llegirFloat("Introdueix el radi desitgat: ", "Tipus dades incorrecte")
    val color: String = llegirWord("Introdueix el color desitgat: ", "Tipus dades incorrecte")

    return Cercle(radi, color)
}