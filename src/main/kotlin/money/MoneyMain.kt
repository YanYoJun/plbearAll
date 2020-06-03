package money

/**
 * Created by yanyongjun on 2020/5/11.
 */

fun main() {
    var rent = 1.05f
    var totalMonth = 12 * 7
    var base = 0

    var result = 100000f
    for (i in 0 until totalMonth) {
        result += base
        result *= rent
    }
    println(result.toInt().toString())
}