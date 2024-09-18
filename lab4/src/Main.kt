
fun main() {

    println("\nЗАДАНИЕ 1")
    println("Введите номер дня недели (1-7):")
    val day = readLine()!!.toInt()
    val daysOfWeek = arrayOf("Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье")
    if (day in 1..7) {
        println("День недели: ${daysOfWeek[day - 1]}")
    } else {
        println("Некорректный номер дня")
    }

    println("\nЗАДАНИЕ 2")
    println("Введите длины трех сторон треугольника:")
    val sides = IntArray(3) { readLine()!!.toInt() }
    val (a, b, c) = sides.sorted()
    if (a + b > c) {
        when {
            a == b && b == c -> println("Треугольник равносторонний")
            a == b || b == c -> println("Треугольник равнобедренный")
            else -> println("Треугольник разносторонний")
        }
    } else {
        println("Треугольник не существует")
    }


    println("\nЗАДАНИЕ 3")
    println("Введите числовое значение оценки:")
    val score = readLine()!!.toInt()
    val grade = when {
        score >= 90 -> "A"
        score >= 80 -> "B"
        score >= 70 -> "C"
        score >= 60 -> "D"
        else -> "F"
    }
    println("Оценка: $grade")

    println("\nЗАДАНИЕ 4")
    println("Введите время (часы):")
    val hour = readLine()!!.toInt()
    when (hour) {
        in 0..5 -> println("Ночь")
        in 6..11 -> println("Утро")
        in 12..17 -> println("День")
        in 18..23 -> println("Вечер")
        else -> println("Некорректное время")
    }

    println("\nЗАДАНИЕ 5")
    println("Введите число:")
    val number = readLine()!!.toInt()
    println("Знак числа: ${if (number > 0) "Положительное" else if (number < 0) "Отрицательное" else "Ноль"}")

    println("\nЗАДАНИЕ 6")
    val secretNumber = (1..100).random()
    var guess: Int
    do {
        println("Угадай число от 1 до 100:")
        guess = readLine()!!.toInt()
        when {
            guess < secretNumber -> println("Слишком мало!")
            guess > secretNumber -> println("Слишком много!")
            else -> println("Поздравляю, вы угадали число!")
        }
    } while (guess != secretNumber)

    println("\nЗАДАНИЕ 7")
    println("Введите строку:")
    val inputString = readLine()!!
    println("Длина строки: ${inputString.length}")

    println("\nЗАДАНИЕ 8")
    println("Введите тип пищи (мясо, рыба, овощи):")
    val foodType = readLine()!!.toLowerCase()
    val cookingTime = when (foodType) {
        "мясо" -> "1-2 часа"
        "рыба" -> "30-40 минут"
        "овощи" -> "15-30 минут"
        else -> "Некорректный тип пищи"
    }
    println("Время приготовления: $cookingTime")

    println("\nЗАДАНИЕ 9")
    println("Введите строку:")
    val anotherString = readLine()!!
    println("Длина строки: ${anotherString.length}")

    println("\nЗАДАНИЕ 10")
    println("Введите способ оплаты (наличные, кредитная карта, PayPal):")
    val paymentMethod = readLine()!!.toLowerCase()
    val paymentMessage = when (paymentMethod) {
        "наличные" -> "Оплата наличными"
        "кредитная карта" -> "Оплата кредитной картой"
        "paypal" -> "Оплата через PayPal"
        else -> "Некорректный способ оплаты"
    }
    println(paymentMessage)

    println("\nЗАДАНИЕ 11")
    println("Введите группу крови (A, B, AB, O):")
    val bloodGroup = readLine()!!.toUpperCase()
    val compatibleBloodTypes = when (bloodGroup) {
        "A" -> "A, O"
        "B" -> "B, O"
        "AB" -> "AB, A, B, O"
        "O" -> "O"
        else -> "Некорректная группа крови"
    }
    println("Совместимые группы крови: $compatibleBloodTypes")

    println("\nЗАДАНИЕ 12")
    println("Введите страну (США, Россия, Япония):")
    val country = readLine()!!.toLowerCase()
    val nationality = when (country) {
        "сша" -> "Американец"
        "россия" -> "Русский"
        "япония" -> "Японец"
        else -> "Некорректная страна"
    }
    println("Национальность: $nationality")

    println("\nЗАДАНИЕ 13")
    println("Введите код ошибки (100, 200, 300):")
    val errorCode = readLine()!!.toInt()
    val errorMessage = when (errorCode) {
        100 -> "Ошибка сети"
        200 -> "Ошибка сервера"
        300 -> "Ошибка базы данных"
        else -> "Некорректный код ошибки"
    }
    println("Сообщение об ошибке: $errorMessage")
}