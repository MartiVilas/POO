package org.example


class Persona(){

    private var dni:String
    private var nom:String
    private var cognoms:String
    private var edat:Int
    private var estatCivil:Boolean


    init {
        dni="00000000A"
        nom="Jose Maria"
        cognoms="Alvarez Rodriguez"
        edat=0
        estatCivil=false
    }

    constructor(nom:String,cognoms:String):this(){
        this.nom=nom
        this.cognoms=cognoms
    }

    constructor(dni:String, nom:String, cognoms: String,edat:Int,estatCivil:Boolean):this(){
        this.dni=dni
        this.nom=nom
        this.cognoms=cognoms
        this.edat=edat
        this.estatCivil=estatCivil
    }

    fun setEdad(edat:Int){
        this.edat=edat
    }

    fun getEdad():Int{
        return this.edat
    }

    fun setDni(dni:String){
        this.dni=dni
    }

    fun getDni():String{
        return this.dni
    }

    fun setCognom(cognom:String){
        this.nom=cognom
    }

    fun getCognom():String{
        return this.cognoms
    }

    fun setEstatCivil(estatCivil: Boolean){
        this.estatCivil=estatCivil
    }

    fun getEstatCivil():Boolean{
        return this.estatCivil
    }
    fun setNom(nom:String){
        this.nom=nom
    }

    fun getNom():String{
        return this.nom
    }

    fun aniversari(){
        edat+=1
    }

    fun casament(){
        estatCivil=true
    }

    fun divorci(){
        estatCivil=false
    }

    override fun toString(): String {
        return  "Dni: $dni\n"+
                "Nom: $nom\n" +
                "Cognom: $cognoms\n"+
                "Edat: $edat\n"+
                "Estat Civil: $estatCivil\n"
    }

}


