import kotlin.math.pow

fun main() {

   stepen(2,10)
}

fun stepen(a: Int, step: Int) {

    var result = a.toDouble()
    println(result.pow(step).toInt())

}