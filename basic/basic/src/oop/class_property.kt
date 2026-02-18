package oop

/**
 * 프로퍼티 = 필드 + getter + setter
 * 코틀린에서는 필드만 만들면 getter, setter를 자동으로 만들어줌.
 * 생성자에서 직접 프로퍼티를 만들 수 있다.
 *
 * 커스텀 getter, setter
 *
 * val custom: Boolean
 * get() = this.age >= 20
 *
 * val uppperName: name
 * get() = field.upperCase()
 * 위와 같이 하지 않고 field대신 name으로 설정하면 무한루프 발
 *
 *  init은 초기화를 의미합니다. 아래와 같이 진행됩니다.
 *  생성자 호출-> 초기화
 * */

/**
 * Person 클래스에 val 또는 var를 붙이면 getter, setter 가 자동 생성하고 이것들을 프로퍼티라고 말한다.
 * */
class Person(val name: String, var age: Int)


fun main() {
  val personCustom = PersonCustom("name", 10)
  personCustom.age = 10
  println(personCustom.age)
  print(personCustom.name)

  PersonInit("name", 100)
}
class PersonCustom(name: String, age: Int) {

  //아래와 같이 하면 무한루프 발생, 이유는 get() = name.uppercase()의 name이 해당 get을 계속 호출하여 무한 루프 발생
//  val name = name
//    get() = name.uppercase()
  val name = name
    get() = field.uppercase()

  //set(value)에서 value는 파라미터
  var age: Int = age
    set(value) {
      field = field + value
    }
}

class PersonInit(val name: String,val age: Int) {

  init {
    println("Initializing")
    println("Age: $age")
    println("name: $name")
  }
}

/**
 * 매개변수가 없는 생성자만 있는 경우 생략 가능
 *
 * 바디({}) 부분에 constructor를 이용하여 부 생성자 사용
 * */
class PersonConstruct(val name: String, val age: Int) {

  constructor(name: String) : this(name, 1)

}