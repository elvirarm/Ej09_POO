class Tarea(val id: Int, val descripcion: String) {

    var estado = "pendiente"

    override fun toString(): String {
        return "Tarea: $id, descripción: $descripcion, estado: $estado"
    }
}