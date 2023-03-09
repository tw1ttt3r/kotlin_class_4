package travels

abstract class Travel {
    abstract val country: String
    abstract val city: String
    final val serviceType = "Viaje"
    protected var reserved = false
    protected var paidAmount = 0.0

    fun reserve(numDays: Int ) {
        if (reserved) {
            println(
                """
                Tu reservación esta completa
                    Paìs: $country
                    Ciudad: $city
                    Precio: $paidAmount
            """.trimIndent()
            )
        } else {
            val amount = getPrice(numDays)
            if (amount == 0.0) {
                return
            }
            reserved = true
            paidAmount = amount
            println(
                """
                Tu reservación esta completa
                    Paìs: $country
                    Ciudad: $city
                    Precio: $paidAmount
            """.trimIndent())
        }
    }

    abstract fun getPrice(numDays: Int): Double
    abstract fun quotePrice(numDays: Int): Unit
}