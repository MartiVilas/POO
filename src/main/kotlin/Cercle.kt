package org.example

class Cercle (){
    private var radi:Float = 0f
    private var color: String = "Blanc"


    constructor(radi:Float):this(){
        this.radi=radi
    }

    constructor(radi:Float, color:String):this(){
        this.radi=radi
        this.color=color
    }

    fun setRadi(radi:Float){
        this.radi=radi
    }

    fun getRadi():Float{
        return this.radi
    }

    fun setColor(color:String){
        this.color=color
    }

    fun getColor():String{
        return this.color
    }

}