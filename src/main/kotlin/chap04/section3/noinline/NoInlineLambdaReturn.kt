package chap04.section3.noinline

fun main() {
    reFunc()
}

fun reFunc() {
    println("start of retFunc")
    inlineLambda(13, 3) labelSample@{ a, b -> //만약 라벨명 생략 시 메서드명이 암묵적으로 라벨명이 됨
        val result = a + b
        if (result > 10) return@labelSample
        println("result: $result")
    }
    println("end of reFunc")

}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}


