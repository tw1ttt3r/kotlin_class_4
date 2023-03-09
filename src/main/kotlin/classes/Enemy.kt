package classes

open class Enemy (val name: String, val strength: Int) {

    init {
        println("Iniciando super clase Enemy")
    }

    protected var direction: String = "LEFT"

    open fun collision(collider: String) {
        when(collider) {
            "Weapon" -> die()
            "Enemy" -> changeDirection()
        }
    }

    protected fun die() {
        println("$name ha muerto")
    }

    protected fun changeDirection() {
        direction = if (direction == "RIGHT") "LEFT" else "RIGHT"
        println("$name cambio dirección a $direction")
    }

}