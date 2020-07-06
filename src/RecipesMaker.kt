

fun main(args: Array<String>){
    do {
        //inicio del menú
        println("Selecciona la opción deseada")
        println("1. Hacer una receta")
        println("2. Ver mis recetas")
        println("3. Ver ingredientes actuales")
        println("4. Salir")
        //variable que recibe la entrad para el menú
        var leer: String? = readLine()
        //When para las opciones del menú
        when(leer){
            "1" -> {
                viewRecipe(leer)
                makeRecipe()
                var read: String? = readLine()
            }
            "2" -> {
                viewRecipe(leer)
                var read: String? = readLine()
            }
            "3" -> {
                viewRecipe(leer)
                makeRecipe()

                var read: String? = readLine()
            }
            "4" -> println("Salir")
            else -> println("Elige una opción correcta")
        }
    }while (leer != "4")

}
fun makeRecipe(){
    val ingredientes = arrayOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")
    for ((index, ingre) in ingredientes.withIndex()){
        println("   $index. $ingre")
    }
}

fun viewRecipe(menu: String): String{
    when(menu){
        in "1" ->{
            println("Hacer recetas")
            println("Selecciona por categoría el ingrediente que buscas")
            /*println("1. para regresar al menu principal")
            println("2. Salir")*/
        }
        in "2" ->{
            println("Ver las recetas creadas")
            /*println("1. para regresar al menu principal")
            println("2. Salir")*/
        }
        in "3" ->{
            println("Ingredientes Actuales")
            /*println("1. para regresar al menu principal")
            println("2. Salir")*/
        }
    }
    return "0"
}