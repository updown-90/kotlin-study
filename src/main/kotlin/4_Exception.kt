
fun main() {

    try {
        throw Exception()
    } catch (e: Exception) {
        println("에러 발생!")
    } finally {
        println("finally 실행!")
    }

    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println("예외 발생 !")
    }
    println(a)

    // 직접 Exception을 발생시키는 방법
    // throw Exception("예외 발생!")

    val b: String? = null
    val c: String = b ?: failFast("a is null")

    println(c.length)


}

// Nothing 이라는 타입을 반환 = 이 코드가 정상적으로 동작하지 않는다는것
fun failFast(message: String): Nothing {
    throw IllegalArgumentException(message)
}
