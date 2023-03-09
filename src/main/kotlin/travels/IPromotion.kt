package travels

interface IPromotion {
    val discount: Int
    val typeDiscount: Int // 0: Pocentaje, 1: Cantidad

    fun getDiscountPrice(amount: Int): Int = if (typeDiscount == 0) ((amount*( 100 - discount )) / 100) else (amount - discount)

}