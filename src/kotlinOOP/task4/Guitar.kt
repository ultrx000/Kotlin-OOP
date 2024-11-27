package kotlinOOP.task4

class Guitar: Playable {
    override fun play() {
        println("гитара играет")
    }

    fun guitarPlay() {
        println("ведите команду play")
        val a = readln()

        if (a == "play") {
            val guitar = Guitar()
            guitar.play()
        } else {
            println("неверная команда")
        }
    }
}