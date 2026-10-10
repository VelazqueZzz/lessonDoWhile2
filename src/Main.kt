//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите количество секунд: ")
    val seconds = readln().toInt()

    var remaining = seconds   // сколько секунд осталось

    do {
        if (remaining > 0) {
            println("Осталось секунд: $remaining")
        }
        Thread.sleep(1000)    // пауза 1 секунда
        remaining--           // уменьшаем счётчик
    } while (remaining > 0)

    println("Время вышло")
}