fun main() {
    val date = MyDate()
    date.day = 15
    date.month = 9
    date.year = 2023
    println("Дата: ${date.day}.${date.month}.${date.year}")
    print("\"Одинаковое число в месяце и дне  ")
    println(date.day == date.month)

    if (date.month == 12) {
        date.month = 1
        date.year++
    } else {
        date.month++
    }
    println("Дата: ${date.day}.${date.month}.${date.year}")
}