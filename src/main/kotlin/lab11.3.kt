fun main() {
    println("Введите имя")
    val name = readln()

    println("Введите цену")
    val price = readln().toDouble()

    println("Введите количество")
    val quantity = readln().toInt()

    println("Введите год")
    val year = readln().toInt()

    val product = WarehouseProduct(name,price,quantity)
    println(product.getQ())

    val product2 = WarehouseProductWithYear(name, price, quantity, year)
    println(product2.getQ())


}