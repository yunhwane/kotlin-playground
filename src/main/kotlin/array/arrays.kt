fun main(){
    val squares = arrayOf(1,2,3,4)
    squares.size // 4
    squares[0] // 1
    squares[1] // 2

    /*
    배열 원소 변경
     */
    squares[0] = 100
    squares[1] = 200
    squares.forEach { println(it) }

    /*
    참조형 데이터 변경
     */
    val number = squares.copyOf()
    number[0] = 1000
    number[1] = 2000
    number.forEach { println(it) }
    squares.copyOf(2).forEach { println(it) }
    squares.copyOf(5).forEach { println(it) }
    squares.copyOfRange(1,3).forEach { println(it) }
    /*
    자바 같은 경우
    Object[] squares = new String[]{"1","2","3","4"};
    가능하다. 하지만 코틀린 같은 경우는 다른 배열 타입과 대입을 금지한다.
    ? 배열은 가변 데이터 구조 이기 때문에 런타임시 문제가 발생한다.
     */

    val b = intArrayOf(1, 2, 3) + 4 // 원소를 하나만 추가 : 1, 2, 3, 4
    val c = intArrayOf(1, 2, 3) + intArrayOf(5, 6) // 다른 배열을 추가 : 1, 2, 3, 5, 6

    /*
    배열 비교에서 자바와 같이 참조 값 비교하기 때문에 false가 나온다.
     */
    println(intArrayOf(1, 2, 3).contentEquals(intArrayOf(1, 2, 3))) //true

}