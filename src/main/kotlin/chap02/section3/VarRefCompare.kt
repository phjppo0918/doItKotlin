package chap02.section3

fun main(){
    val a: Int = 128
    val b = a
    println(a === b)

    val c: Int? = a // 힙에 새로운 주소 생성 후 a값 대입
    val d: Int? = a // 힙에 새로운 주소 생성 후 a값 대입
    val e: Int? = c
    println(c == d)
    println(c === d)
    println(c === e)

}