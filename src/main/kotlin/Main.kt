fun main() {
    // Создать приложение, с помощью которого пользователь, введя два числа и символ операции, узнает результат.
    // Символами операции могут быть: / — деление, * — умножение, + — сложение, - — вычитание.
    // Числа могут быть вещественными. Числа и знак операции разделяются между собой одним пробелом.
    // Ввод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ


    val inputVal = readln()

    val parts = inputVal.split(" ")
    if (parts.size != 3) {
        println("Неверный формат.")
        return
    }

    val num1 = parts[0].toDoubleOrNull() ?: 0.0
    val num2 = parts[1].toDoubleOrNull() ?: 0.0
    val operation = parts[2]

    var result: Double? = null
    when (operation) {
        "+" -> result = num1 + num2
        "-" -> result = num1 - num2
        "*" -> result = num1 * num2
        "/" -> {
            if (num2 == 0.0) {
                println("Деление на ноль")
            } else {
                result = num1 / num2
            }
        }
        else -> println("Нет")
    }

    if (result != null) {
        println("Результат: $result")
    }
}