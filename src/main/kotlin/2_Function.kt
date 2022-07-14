// 기본적인 함수 선언 스타일
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 표현식 스타일
fun sum2(a: Int, b: Int): Int = a + b

// 표현식 & 반환타입 생략
fun sum3(a: Int, b: Int) = a + b


// 몸통이 있는 함수는 반환 타입을 제거하면 컴파일 오류
fun sum4(a: Int, b: Int): Int {
    return a + b
}

// 반환타입이 없는 함수는 Unit을 반환한다
fun printSum(a: Int, b: Int): Unit {
    println("$a + $b = ${a + b}")
}


// 디폴트 파라미터
fun greeting(message: String = "안녕하세요!!") {
    println(message)
}
//
//fun main( ) {
//    greeting()
//    greeting("HI!!!")
//}


fun log(level: String = "INFO", message: String) {
    println("[$level]$message")
}

// named Arguments 이름과 값을 매핑하는 기법
// 함수를 호출할 때, 인자 값와 함께 매치될 인자 이름을 써줄 수 있다. 이를 named arguments라고 한다.
// 이 방식은 인자의 순서가 바뀌어도 문제가 없기 때문에 호출하는 쪽에서는 함수 인자 순서에 완전히 독립할 수 있다는 장점이 있다.
fun main() {
    log(message = "인포 로그")
    log(level = "DEBUG", "디버그 로그")
    log("WARN", "워닝 로그")
    log(message = "에러 로그", level = "ERROR")
}




