/**
 * @author Meiram Sopy Temirzhanov
 */

fun main(args: Array<String>) {
    var a: String = "Meiram"
    var b: String? = "Sopy"

    //a = null -> NPE Null Pointer Exception
    //b?.length -> safe called

    //Elvis operator
    val l = b?.length ?: -1

    b = if((0..10).random() > 5) "asdas" else null
    //!! Выбрасывается NPE если в переменной содержится null
    val t = b!!.length

}