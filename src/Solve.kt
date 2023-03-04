import java.util.*

/**
 * @author Meiram Sopy Temirzhanov
 */
fun main(args: Array<String>) {
//    var x = 2598
//    var y = 799
//    x += y
//    y = x - y
//    x -= y
//    println("x = $x, y = $y")
//
//    var items = IntArray((0 until 100).random())
//    for(i in items.indices) {
//        items[i] = i
//    }
//    println(items.toList())

//    var items2 = mutableListOf<String>()
//    items2.add("Meiram")
//    items2.add("Sopy")
//    items2.add("John")
//    items2.add("Mary")

//    items2[0] = "Temirzhanov"
//    items2.forEach {e -> print("$e ")}
    //println()
    //var nums = listOf(1,2,3,4,5,6,7,8,9)

    val reader = Scanner(System.`in`)

    val num = reader.nextInt()

    var numbers = IntArray(num)
    for (i in 0 until num) {
        numbers[i] = (1..10).random()
    }
    println(numbers.toList())
    //numbers.forEach {e -> if ( e % 2 == 0) print("$e is even \n") else print("$e is odd \n") }

    println(numbers.indices)

    for (i in numbers.indices) {
        print("${numbers[i]}, ")
    }

    val items = arrayListOf<String>()
    items.add("Meiram")
    items.add("Sopy")
    items.add("John")

    println(items[0].substring( 2))
}



