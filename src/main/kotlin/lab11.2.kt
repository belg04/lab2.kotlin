fun main(args: Array<String>) {
    println("Введите день")
    val day = readln().toInt()
    println("Введите месяц")
    val month = readln().toInt()
    println("Введите год")
    val year = readln().toInt()
    println("Введите название лекарства")
    val name = readln()
    println("Введите наименование производителя ")
    val brand = readln()

    val drug: Drug = Drug(name,day,month,year,brand)
    println(drug.elapsedDays())



}