import kotlin.math.roundToInt

class persona(var nombre: String, peso: Double, altura: Double ) {
    var peso = peso
        set(value){
            require(value>0){"El peso tiene que ser mayor a 0"}
        }

    var altura = altura
    var imc : Double = 0.0

    init {
        imc = ((peso /(altura * altura))*100.00).roundToInt()/100.00
    }
    constructor( peso: Double , altura: Double , nombre: String): this(nombre, peso, altura){
        this.nombre = nombre
        this.altura = altura
        this.peso = peso
    }

    fun saludar(){
        println("Hola ${this.nombre}")
    }

    fun  mostrarDesc(){
        var salud = ""
        when {
            (imc < 18.5) -> salud = "peso insuficiente"

            (imc > 18.5 || imc <= 24.9) -> salud ="peso saludable"

            (imc >= 25.0 || imc <= 29.9) -> salud ="sobrepeso"

            (imc >= 30.0) -> salud ="obesidad"
        }
        println("${this.nombre} con una altura de ${this.altura}m ${if (alturaEncimaMedia()== true){
            "(Por encima de la media)"
        } else {"(Por debajo de la media)"}
        } y un peso ${this.peso}kg ${if (pesoEncimaMedia() == true){
            "(Por encima de la media)"
        }else{"(Por debajo de la media)"}} tiene un IMC de ${this.imc} [$salud]")
    }

    fun alturaEncimaMedia():Boolean{
        if (this.altura >= 1.75 ){
            return true
        }else return false
    }

    fun pesoEncimaMedia():Boolean{
        if (this.peso >= 70){
            return true
        }else return false
    }
}

