fun main(){

    /*
    배열 정의하기
     - 특징은 각 함수는 제네릭하다. 따라서 호출 시 무조건 원소 타입을 지정해야한다.
     - 타입 추론으로 a d 는 타입 추론으로 인자들의 타입을 알 수 있다.
     - b c 는 컴파일러가 타입추론을 할수 없으므로 꺽쇠를 통한 타입을 지정해야한다.
     - d는 람다식을 통해 초기화를 할 수 있다.
     */
    var a = arrayOf(1,2,3,4,5)
    val b = emptyArray<Int>() // 빈 배열
    val c = arrayOfNulls<Int>(5) // null로 초기화된 5개의 정수 배열
    val d = Array(5, {i -> i * 2}) // 0,2,4,6,8로 초기화된 배열

    /*
    람다식과 Array()
    - 자동으로 인덱스를 선언하는 it를 사용함.
    - 배열 인덱스에는 1 4 9 16 25가 들어감
     */
    val size = readLine()!!.toInt()
    val squares = Array(size){(it+1)*(it+1)}
    squares.forEach { println(it) }

    /*
    boxing, unboxing
    여기서 다른점은 자바는 new 연산자를 통한 인스턴스 생성을 할 수 없지만 코틀린은 배열 원소를 명시적으로 초기화해줘야한다.
    ShortArray, IntArray, LongArray, FloatArray, DoubleArray, CharArray, BooleanArray
     */
    val operations = charArrayOf('+','-','*','/')
    val squart = IntArray(10){(it+1)*(it+1)}
    operations.forEach { println(it) }
    squart.forEach { println(it) }
}