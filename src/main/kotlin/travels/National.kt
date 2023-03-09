package travels

open class National(override val city: String): Travel() {
    override val country: String = "México"

    protected val fees = mapOf(
        "Monterrey" to 400,
        "Guadalajara" to 350,
        "CDMX" to 360,
        "San Cristóbal de las casas" to 240,
        "San Miguel de Allende" to 320,
    )

    override fun quotePrice(numDays: Int) {
        val price = getPrice(numDays)
        if (price == 0.0) {
            println("No hay viajes a esta ciudad")
        } else {
            println("El total del viaje a $city es: $price")
        }
    }
    override fun getPrice(numDays: Int): Double {
        val fee = fees[city]
        return if (fee == null) 0.0 else fee*(numDays.toDouble())
    }

}