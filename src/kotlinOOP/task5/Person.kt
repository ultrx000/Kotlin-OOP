package kotlinOOP.task5

open class Person(val name: String,val role: String) {

    open fun showInfo() {
        println("$name - $role")

    }

    fun enterAndPrintData() {
        println("введите имя")
        val name = readln().lowercase()
        println("moder или admin")
        val role = readln().lowercase()

        val user: Person = when(role) {
            "moder" -> Moder(name)
            "admin" -> Admin(name)
            else -> Person(name, role)
        }
        user.showInfo()
    }

}