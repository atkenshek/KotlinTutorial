/**
 * @author Meiram Sopy Temirzhanov
 */

fun main(args: Array<String>) {
    testWhen(1)
    testWhen("Hello")
    testWhen(13)
}

fun testWhen(x: Any){
    when(x){
        //1 -> println("1")
        "Hello" -> println("Hello World")
        13 -> println("13")
        in 1..20 -> println("from 10 to 20")
        is String -> println("This is a string: $x with length: ${x.length}")
        is Int -> println("This is an integer: $x")
        else -> println("Anything else...)")
    }
}