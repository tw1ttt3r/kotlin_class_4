package travels

class NationalLowSeason(city: String): National(city), IPromotion, ICancelTravel {
    override val discount: Int = 10
    override val typeDiscount: Int = 0

    override fun cancelarViaje() {
        if (reserved) {
            paidAmount = 0.0
            reserved = false
            println("El viaje fue cancelado exitosamente")
            return
        }

        println("El viaje fue cancelado previamente")
    }

    override fun getPrice(numDays: Int): Double {
        val amount = super.getPrice(numDays)
        return if (amount == 0.0) amount else getDiscountPrice(amount.toInt()).toDouble()
    }

}