fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    val arsh = "Arsh Vardhan Atreya"
    val pet = "Freddy"
    println(pet)

    val timsWeeklySalary = 32
    val timsMonthlySalary = timsWeeklySalary * 4
    println("Arsh's $ weekly salary is $$timsWeeklySalary")
    println("Monthly, that comes to $timsMonthlySalary")

    println()

    val apples = 6
    val oranges = 5
    val fruit = apples - oranges
    println("$apples apples - $oranges oranges leaves $fruit piece(s) of fruit")

    println("A quarter of the apples is ${apples / 4}")

    println()
    val weeks = 234
    val years = weeks / 52.0
    println("$weeks weeks is $years years")


    println("My pet's name is $pet")
    println("My full name is $arsh")
}