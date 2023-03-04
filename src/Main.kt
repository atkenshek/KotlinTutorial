/**
 * @author Meiram Sopy Temirzhanov
 */
fun main(){
    val x = 5
    val y = 2.0
    val result = x + y
    println(result)
    println("result = ${x + y}")
    println("result = ${x - y}")
    println("result = ${x / y}")
    println("result = ${x * y}")
    println("result = ${x % y}")

    var res = 0
    println("res = ${res++}")
    println("res = ${++res}")

    println(print(12, 2))
}

fun print(x: Int, y: Int): String = "Result = ${x + y}"


//    val maxValueOFByte = Byte.MAX_VALUE.toInt()
//    val minValueOFByte = Byte.MIN_VALUE.toInt()
//
//    val answer = minValueOFByte + maxValueOFByte
//    println(answer)
//    println("Maximum value of byte: $maxValueOFByte")
//    println("Minimum value of byte: $minValueOFByte")
//
//    val maxFloatValue = Float.MAX_VALUE
//    println("Maximum value of float: $maxFloatValue")