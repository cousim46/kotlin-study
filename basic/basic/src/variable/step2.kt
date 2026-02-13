
/**
 * Safe call
 * - null이 아니면 실행하고 null이면 실행하지 않는다
 * e.g
 * val str: String? = "A"
 * str.length <- 컴파일 에러 발생, 이유 : null일 수 있기 때문에
 * str?.length <- 정상 동작
 *
 * , Elvis 연산자 (?:)
 *- 앞의 연산 결과가 null이면 뒤에 값 사용
 *
 * e.g
 * val str: String? = null
 * str?.lenght ?: "a" --> 결과값 a 출력
 *
 * 절대 null일 수 없는 경우 "!!" 사용
 *- 절대 Null일 수 없을거라 생각했지만 null일 경우 NPE 발생
 * */
fun main() {
  val str: String? = null
//  str.length
  println(str?.length)
  startWith(null)
}

/**
 * null이 들어오는 경우에 대한 코틀린 처리 예시
 * */
fun startsWith1(str: String?): Boolean {
  if (str == null) {
    throw IllegalArgumentException("String cannot be null")
  }
  return str.startsWith("A")
}

fun startWith1UseSafeCall(str: String?): Boolean {
  return str?.startsWith("A") ?: throw IllegalArgumentException("String cannot be null")
}

fun startsWith2(str: String?): Boolean? {
  if (str == null) {
    return null
  }
  return str.startsWith("A")
}
fun startWith2UseSafeCall(str: String?): Boolean? {
  return str?.startsWith("A")
}

fun startsWith3(str: String?): Boolean {
  if (str == null) {
    return false
  }
  return str.startsWith("A")
}
fun startWith3UseSafeCall(str: String?): Boolean {
  return str?.startsWith("A") ?: false
}

fun startWith(str: String?): Boolean {
  return str!!.startsWith("A")
}
