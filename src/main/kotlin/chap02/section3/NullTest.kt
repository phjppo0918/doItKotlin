package chap02.section3

fun main() {
    var str1: String = "Hello"

    //기본적으로 코틀린 변수는 null 대입을 허용하지 않음
    // str1 = null //error!

    //null대입을 허용하려면 VAR? 형태로 선언해야 한다
    var str2 : String? = "Hello"
    str2 = null
    println("str2: $str2")

    //null을 허용시 일부 함수가 제한됨
    //val strLength : Int = str2.length // error!

    //세이프콜(?.)로 안전하게 호출
    var strLength : Int? = str2?.length

    //단정기호(!!.)로 NPE시 에러 호출
    str2 = "st"
    println("str2: ${str2!!.length}")

    //엘비스 연산자(?:)
    strLength = str2?.length ?: -1
}