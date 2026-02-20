package oop

/**
 * 자바에서 사용하는 static 대신 코틀린에서는 companion object 사용
 * const는 상수일때 사용 : 컴파일 시점에 값 할당
 * const를 붙이지 않으면 런타임 시점에 값 할당
 *
 * companion object(동반 객체)는 하나의 객체로 간주됨.
 * 이름을 붙일수도 있고 interface를 구현할수도 있음
 *
 * 싱글톤 : 단하나의 인스터느를갖는 클래스
 *
 * 코틀린에서 싱글톤 만드는 방법
 * object 키워드 사용
 *
 * 익명 클래스 : 특정 인터페이스나 클래스를 상속받은 구허체를 일회성으로 사용할때 쓰는 클래스
 *
 * object : 익명 클래스 {
 *    익명클래스에 정의해놓은 메서드
 * }
 *
 * */
fun main() {
  Sigleton.number = 1
  anonymousMethod(object : Anonymous {
    override fun play(): String {
      return "anonymous"
    }
  })
}

fun anonymousMethod(anonymous: Anonymous) {
  println(anonymous.play())
}
class PersonObject private constructor(var name: String,
                                 var age: Int)
{
  companion object  {
    val MIN_AGE = 1
    fun newBaby(name: String): PersonObject {
      return PersonObject(name = name, age = MIN_AGE)
    }
  }
}

object Sigleton {
  var number = 0
}

interface  Anonymous{
  fun play() : String
}
