package oop

/**
 * 코틀린에서 inner class를 사용할때는 클래스 앞에 inner 키워드 사용
 * inner class의 상위 클래스의 필드를 사용하고 싶으면 this@상위클래스.필드
 *
 * 코틀린에서 static nested class를 사용할때는 일반적으로 생성하는 클래스 방식처럼 사용
 * */


fun main() {
  val nameValue = InnerClassEx(name = "name").InnerClass(age = 1).nameValue
  StaticNestedClass.NestedClass(age = 2)
}
class InnerClassEx(private val name: String){
  inner class InnerClass(
    private val age: Int,
  ) {

    val nameValue: String
      get() = this@InnerClassEx.name
  }
}

class StaticNestedClass(private val name: String) {
  class NestedClass(private val age: Int) {

  }
}