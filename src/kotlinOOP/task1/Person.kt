package kotlinOOP.task1

class Person(private var name: String) {

    private fun setName(newName: String) {
        name = newName
    }

    private fun printName() {
        println("Name: <$name>")
    }

    fun enterData(list: ArrayList<Person>) {
        println("введите количество людей:")
        val a = readln().toInt()

        for (i in 1..a) {
            println("введите имя человека:")
            val name = readln()
            val person = Person(name)
            person.setName(name)
            list.add(person)
        }
    }

    fun printList(list: ArrayList<Person>) {
        for (i in list) {
            i.printName()
        }
    }
}


