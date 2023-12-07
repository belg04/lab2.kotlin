import java.time.LocalDate
import java.time.Period
import java.time.temporal.ChronoUnit
import kotlin.time.Duration
import kotlin.time.Duration.Companion.days

open class Date(_day: Int, _month: Int, _year: Int) {
    var day: Int
    var month: Int
    var year: Int
    protected var dateTime: LocalDate

    init {
        day = _day
        month = _month
        year = _year
        dateTime = LocalDate.of(year, month, day)
    }
}

open class Drug(_name: String ,_day: Int, _month: Int, _year: Int, _brand: String) : Date(_day, _month, _year) {
    var name: String
    var brand: String

    init {
        name = _name
        brand = _brand
    }

    fun elapsedDays(): Duration {
        return ChronoUnit.DAYS.between(dateTime, LocalDate.now()).days
    }
}