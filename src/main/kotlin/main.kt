import classes.Enemy
import classes.Goomba
import classes.Koopa
import travels.National
import travels.NationalLowSeason
import travels.International


fun main() {


    val enemy = Enemy("peter", 1)

    enemy.collision("Enemy")
    enemy.collision("Weapon")


    val goomba = Goomba()


    val koopa = Koopa()

    koopa.collision("Enemy")
    koopa.collision("Weapon")
    koopa.collision("Weapon")

    val travelNational = National("CDMX")
    travelNational.quotePrice(2)
    travelNational.reserve(4)

    val travelMty = NationalLowSeason("CDMX")
    travelMty.reserve(4)


    val travel = International("Alemania", "Francfort")

    travel.reserve(4)

    val travelCDMX = NationalLowSeason("CDMX")
    travelCDMX.reserve(4)
    travelCDMX.cancelarViaje()
    travelCDMX.cancelarViaje()
    travelCDMX.reserve(3)
}