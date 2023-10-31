import java.util.Date

fun main(){

    val hello = "hello kotlin ! "

    // 코틀린은 여러 식에서 문자열 합성할 수 있는 방법을 지원 한다.
    val text = "hello kotlin ! \n This is \"multiline\" string"
    println(text)
    println("\u03C0\u2248 3.14")

    val name = readLine()
    println("Hello, $name !\n Todayis ${Date()}")

    /*
    length, lastIndex
     */
    "hello!".length // 6
    "hello!".lastIndex // 5

    /*
    [] 개별 문자 접근법
     */
    val str = "yunhwan"
    println(str[0])
    println(str[1])
    println(str[2])
    println(str[3])
    println(str[4])
    println(str[5])

    /*
    두 문자 연결 하기
    자바와 같음, the sum is $sum 도 가능
     */

    // 두 문자열 비교 문자열은 사전식 순서로 정렬되기 때문에 < > <= >= 도 가능 하다
    println("abc" == "abc") // true
    println("abc" < "bac") // true

    /*
    문자열이 제공하는 유용한 함수
     */
    "".isEmpty() // true
    "abc".isEmpty() // false
    "hello".isNotEmpty() // true
    "hello".startsWith("he") // true
    "hello".endsWith("lo") // true
    "abcdefg".indexOf("c") // 2
    "abcdefg".indexOf("c",2) // -1

}