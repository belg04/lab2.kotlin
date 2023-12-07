import java.time.LocalDate

open class WarehouseProduct(_name: String, _price: Double, _quantity: Int) {
    var name: String
    var price: Double
    var quantity: Int

    init {
        name = _name
        price = _price
        quantity = _quantity
    }

    open fun getQ(): Double {
        return price * quantity
    }
}

open class WarehouseProductWithYear(_name: String, _price: Double, _quantity: Int, _year: Int) : WarehouseProduct(
    _name,
    _price,
    _quantity
) {
    var year: Int

    init {
        year = _year
    }

    override fun getQ(): Double {
        return super.getQ() + 0.5 * (LocalDate.now().year - year)
    }
}