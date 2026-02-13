package variable

/**
 * var : 가변 , 자바에서는 일반 변수
 * val : 불변, 자바에서는 final 사용
 * 자바에서는 타입을 필수로 적어야 하지만 코틀린에서는 타입을 추론해줘서 작성안해줘도 된다.
 *
 * 초기값을 지정해주지 않는 경우에는 코틀린 타입 추론이 어려워 타입을 명시해줘야한다.
 *
 * 코틀린에서 Nullable 상태로 만들기 위해 "?"를 사용한다.
 * e,g var num:Long? = null
 *
 * 자바에서는 인스턴스화를 할 때 new를 붙이지만 코틀린에서는 사용하지 않는다.
 * e.g
 * java -> Person person = new Person()
 * kotlin -> var person:Person = Person()
 * */
fun main() {
  var number = 10L
  val number2 = 10L

  var number3: Long? = 1_000L
  number3 = null



}
