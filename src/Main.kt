//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {

    var listaTareas = mutableListOf<Tarea>()


    fun agregarTarea(): MutableList<Tarea>{

        println("Añade una descripción para la tarea nueva: ")
        val descTarea = readln()

        println("Añade un id para la tarea nueva: ")
        val idTarea = readln().toInt()

        val tareaNueva = Tarea(idTarea, descTarea)
        listaTareas.add(tareaNueva)

        return listaTareas
    }

    fun eliminarTarea(): MutableList<Tarea>{
        println("Dame el id de la tarea que quieres eliminar: ")
        val idTarea = readln().toInt()
        val tarea: Tarea? = listaTareas.find{idTarea == it.id}
        listaTareas.remove(tarea)
        return listaTareas
    }

    fun cambiarEstadoTarea(): String?{


        println("Dame el id de la tarea que quieres eliminar: ")
        val idTarea = readln().toInt()
        val tarea: Tarea? = listaTareas.find{idTarea == it.id}

        println("Añade el nuevo estado de la tarea (pendiente / realizada: ")
        tarea?.estado = readln()
        return tarea?.estado
    }

    fun mostrarTodasTareas(listaTareas: MutableList<Tarea>){

        for (tarea in listaTareas){
            println(tarea)
        }

    }

    fun mostrarTareasPendientes(listaTareas: MutableList<Tarea>){

        var tareasPendientes = mutableListOf <Tarea>()

        for (tarea in listaTareas) {
            if (tarea.estado == "pendiente") {
                tareasPendientes.add(tarea)
            }
        }

        println(tareasPendientes)

    }

    fun mostrarTareasRealizadas(listaTareas: MutableList<Tarea>){

        var tareasRealizadas = mutableListOf <Tarea>()


        for (tarea in listaTareas) {
            if (tarea.estado == "realizada") {
                tareasRealizadas.add(tarea)
            }
        }
        println(tareasRealizadas)

    }
    var salir = false
    do{
    println("--MENÚ--\n Pulsa 1 para agregar tarea \n Pulsa 2 para eliminar una tarea \n Pulsa 3 para cambiar el estado de una tarea \n Pulsa 4 para mostrar la lista de tareas. \n Pulsa 5 para mostrar la lista de tareas pendientes. \n Pulsa 6 para mostrar la lista de tareas ya realizadas. \n Pulsa 7 para salir.")

    val opcion = readln()

    when (opcion){
        "1" -> agregarTarea()
        "2" -> eliminarTarea()
        "3" -> cambiarEstadoTarea()
        "4" -> mostrarTodasTareas(listaTareas)
        "5" -> mostrarTareasPendientes(listaTareas)
        "6" -> mostrarTareasRealizadas(listaTareas)
        "7" -> salir = true

    }
    }while(!salir)

}