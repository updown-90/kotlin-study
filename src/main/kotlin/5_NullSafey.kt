fun getNullStr(): String? = null

fun getLengthIfNotNull(str: String?) = str?.length ?: 0

fun main() {

    val nullableStr = getNullStr()

    // 엘비스 연산자 ?:
    val nullableStrLength = nullableStr?.length ?: "null인 경우 반환".length
    println(nullableStrLength)

    val length = getLengthIfNotNull(null)
    println(length)


    // throw NullPointerException()

    // ? 안전연산자
    // val c: String? = null
    // !! 단언연산자
    // val d = c!!.length
//    println(Java_NullSafety.getNullStr()?.length ?: 0)





}
