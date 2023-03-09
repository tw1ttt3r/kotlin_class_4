package travels

import java.math.RoundingMode
import java.text.DecimalFormat

class International(override val country: String, override val city: String): Travel() {

    protected val menu = mapOf(
        "Alemania" to mapOf<String, Int>(
            "Munich" to 980,
            "Berlín" to 820,
            "Francfort" to 850,
        ),
        "Chile" to mapOf<String, Int>(
            "Santiago" to 643,
            "Valparaíso" to 721,
        ),
        "Canada" to mapOf<String, Int>(
            "Vancouver" to 620,
            "Ottawa" to 680,
            "Montreal" to 600,
        )
    )

    protected val fees =  mapOf<String, Double>(
        "Alemania" to .16,
        "Chile" to .5,
        "Canada" to .1,
    )


    override fun getPrice(numDays: Int): Double {
        val menuCountry = menu[country]!!
        val price = menuCountry[city]!!
        val fee = fees[country] ?: return 0.0
        val df = DecimalFormat("#.##")
        df.roundingMode = RoundingMode.DOWN
        return df.format(((price * (numDays.toDouble())) * (1 + fee))).toDouble()
    }

    override fun quotePrice(numDays: Int): Unit {
        val price = getPrice(numDays)
        if (price == 0.0) {
            println("No hay viajes a esta ciudad")
        } else {
            println("El total del viaje a $country - $city es: $price")
        }
    }


}