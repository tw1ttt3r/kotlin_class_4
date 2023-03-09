package classes

class Koopas: Koopa() {

    override var state = "Flying"

    override fun collision(collider: String) {
        when (collider) {
            "Weapon" -> {
                when(state) {
                    "Shell" -> die()
                    "Walking" -> state = "Shell"
                    else -> state = "Walking"
                }
            }
            "Enemy" -> changeDirection()
        }
    }

}