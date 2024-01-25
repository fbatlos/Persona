fun main(){
    val persona1 = persona("José" , 10.3 , 2.4 )
    val persona2 = persona("Sara",23.9,1.75)
    val persona3 = persona("Pepe" , 83.5,2.0 )
    val persona4 = persona("Mario" , 79.0 , 1.82)

    var option = 0

    do {
        try {
            print("¿Quien eres?\n-1 ${persona1.nombre}\n-2 ${persona2.nombre}\n-3 ${persona3.nombre}\n-4 ${persona4.nombre}\n=> ")
            option = readln().toInt()
            when(option){
                1 -> {persona1.saludar()
                    persona1.mostrarDesc()
                }
                2 -> {persona2.saludar()
                    persona2.mostrarDesc()
                }
                3 -> {persona3.saludar()
                    persona3.mostrarDesc()
                }
                4 -> {persona4.saludar()
                    persona4.mostrarDesc()
                }
                else -> {
                    println("Fuera de rango." +
                        "Intentelo de nuevo")
                    option = 6
                }
            }
        }catch (_:NumberFormatException){
            println("No valido")
            option = 5
        }
    }while (option!=0)



    print("Quieres cambiar el nombre ${persona1.nombre} si/no? ")
    val comprobante=readln()
    if (comprobante == "si"){
        print("Pon un nombre: ")
        persona1.nombre = readln()
    }else println("El nombre no se ha cambiado")

   /* ACT 1
    println("Persona 1 - Nombre: ${persona1.nombre}")
    println("Persona 2 - Peso: ${persona2.peso} y Altura: ${persona2.altura}, Nombre: ${persona2.nombre}")
    println("Persona 3 - IMC: ${persona3.imc}, Nombre: ${persona3.nombre}")
    */

}