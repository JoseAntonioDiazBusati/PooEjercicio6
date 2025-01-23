class Domicilio(
    private val calle: String,
    private val numero: Int
) {
    fun direccionCompleta() = "$calle, $numero"
}