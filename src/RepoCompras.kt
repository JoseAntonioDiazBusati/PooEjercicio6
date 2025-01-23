class RepoCompras() {
    private val compras = mutableListOf<Compra>()

    fun agregarCompra(compra: Compra){
        compras.add(compra)
    }

    fun agregarCompra(cliente: Cliente, monto: Double, dia: Int){
        compras.add(Compra(cliente, monto ,dia))
    }

    fun domicilios():List<Domicilio>{
        val domicilios = mutableSetOf<Domicilio>()
        for (compra in compras){
            domicilios.add(compra.cliente.domicilio)
        }
        return domicilios.toList()
    }

}