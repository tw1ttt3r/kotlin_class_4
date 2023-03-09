package classes

open class Koopa: Enemy("Koopa", 2) {

    protected open var state = "Walking"
        set(value) {
            println("$name esta $value")
        }

    override fun collision(collider: String) {
        when (collider) {
            "Weapon" -> {
                if (state == "Shell") {
                    die()
                } else {
                    state = "Shell"
                }
            }
            "Enemy" -> changeDirection()
        }
    }
}