package variable

fun main() {
    println("Hello kotlin ! ")

    /*
    변수 정의
     */
    var a = 10;
    var b = 20;
    println(a+b)

    /*
    정수 입력
     */
    var c = readLine()!!.toInt();
    var d = readLine()!!.toInt();

    println(c+d)

    /*
    타입을 명시 가능
     */
    var e : Int = 10
    var f : String = "kotlin"

    /*
    초기값  생략도 가능
     */
    var text : String
    text = "string"
    println(text)

    /*
    가변 변수
     */
    var sum = 1
    sum = sum + 2
    sum = sum + 3

    val sum2 = 1
    /* 에러 발생
    sum2 = sum2 + 2
    */

    /*
    조합 연산
     */
    var result = 3
    result += 2
    result *= 10;
    /*
    기대값 50
     */
    println(result)

    /*
    증감, 후위 연산도 자바와 똑같음
     */
    var fix = 1
    println(fix++) // a는 2, 1이 출력됨
    println(++fix) // a는 3, 3이 출력됨
    println(--fix) // a는 2, 2이 출력됨
    println(fix--) // a는 1, 2이 출력됨

    /*
    수 변환
    toByte(), toShort(), toInt(0, toLong(), toFloat(), toDouble(), toChar()
     */




}

