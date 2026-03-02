package fp

/**
 * 코틀린 함수 사용하는 방법
 * - 확장함수
 * - infix
 *
 * 확장 함수
 * fun 확장함수클래스명.함수명(): 반환값 {
 *    return this.메서드
 * }
 * 여기서 this는 수신 객체라고 칭함
 * - 확장함수명과 같은 멤버 함수가 존재하면 멤버 함수가 우선순위를 갖게 됨.
 * - 오버라이딩한 확장 함수가 존재하면 반환된 타입 기준으로 확장 함수가 호출 됨.
 * - 확장함수가 private, protected 멤버에는 접근 불가능
 *
 * fun main() {
 *   "ABC".lastChar()
 * }
 *
 * fun String.lastChar(): Char {
 *   return this[this.length - 1]
 * }
 *
 * infix 중위함수
 *
 * 함수 앞에 infix를 붙이면 to, step 처럼 사용할 수 있음
 *
 * infix fun Int.numPlus(num: Int) : Int{
 *   return this + num
 * }
 * fun main() {
 *   1 numPlus 2
 * }
 *
 *
 * */

fun main() {
  "ABC".lastChar()
}

fun String.lastChar(): Char {
  return this[this.length - 1]
}

infix fun Int.numPlus(num: Int) : Int{
  return this + num
}