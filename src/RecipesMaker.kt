

fun main(args: Array<String>){
    var ingredientes = listOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")

    do {
        println("Selecciona la opción deseada")
        println("1. Hacer una receta")
        println("2. Ver mis recetas")
        println("3. Ver ingredientes actuales")
        println("4. Salir")

        var leer: String? = readLine()
        //if (response=="1") return println("Funciono")
        when(leer){
            "1" -> {
                println("Crea tu recetas")
                println("1. para regresar al menu principal")
                println("2. Salir")
                var read: String? = readLine()
            }
            "2" -> {
                println("Ver las recetas creadas")
                println("1. para regresar al menu principal")
                println("2. Salir")
                var read: String? = readLine()
            }
            "3" -> {
                println("Ingredientes Actuales")
                println("1. para regresar al menu principal")
                println("2. Salir")

                ingredientes.forEach {
                    println("Ingre.: $it")
                }
                var read: String? = readLine()
            }
            "4" -> println("Salir")
            else -> println("Elige una opción correcta")
        }
    }while (leer != "4")

}