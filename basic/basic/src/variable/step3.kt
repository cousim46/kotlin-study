/**
 * 기본타입 형 변환
 * - 자바에서는 기본 타입간의 변환은 암시적으로 이루어질 수 있다.
 * - 코틀린에서는 기본 타입간의 변환은 명시적으로 이루어져야 한다.
 *
 * 타입 캐스팅
 * - "is"는 자바에서 instanceOf
 * - "!is"는 is의 부정
 * - "as"를 붙여 형 변환, 생략 가능
 * - "as?" 형변환 하려고하는 객체가 null일 경우 사
 *
 * 타입
 * - Any
 * -- 자바의 Object 역할( 모든 객체의 최상위 타입)
 * -- 모든 Primitive Type의 최상위 타입도 Any
 * -- Any 자체로는 null을 포할 X, null을 표현하려면 Any? 표현
 * -- Any에 equals, hashcode, toString 존재
 *
 * - Unit
 * -- 자바의 void와 동일한 역할
 * -- void와 다르게 Unit은 그 자체로 타입 인자로 사용 가능
 * -- 함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미, 코틀린읜 unit은 실제 존재하는 타입이라는것을 표
 *
 * - Noting
 * -- 함수가 정상적으로 끝나지 않았다라는 사실 표현하는 역할
 * -- 무조건 예외를 반환하는 함수
 *
 * String interpolation
 * 자바에서는 String.format 또는 StringBuilder의 append 메서드 사용
 * 코틀린에서는 문자열 중간에 ${변수} 사용
 * */

fun main() {
  // 명시적 형변
  val number1 = 3
  val number2: Long = number1.toLong()

  // 타입 여부 자바에서는 instanceOf
  val isInt = number1 is Int

  val name: String = "hoestory"
  val result = """
    remove indent
    String
    ${name}
  """.trimIndent()
  println(result)
}
