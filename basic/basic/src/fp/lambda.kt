package fp
/**
 * Closure
 *
 * 자바에서는 람다를 사용할때 람다 캡쳐링으로 인하여 final 변수 아닐경우 예외 발생
 *
 * 그러나 코틀린에서는 람다가 시작하는지점에서 참조하고 있는 변수들을 모두 포획하여 그 정보를 가지고 있습니다.그래서 자바에서처럼 예외를 발생하지 않는다.
 * */
fun main() {
  Fruit("사과", 1_000)
  Fruit("사과", 1_200)
  Fruit("사과", 1_200)
  Fruit("사과", 1_500)
  Fruit("바나나", 3_000)
  Fruit("바나나", 3_200)
  Fruit("바나나", 2_500)
  Fruit("수박", 10_000)

  val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
    return fruit.name == "사과"
  }

  val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과"}
  lambdaTest({fruit -> fruit.name == "사과"})
  lambdaTest() {fruit -> fruit.name == "사과"}
}


fun lambdaTest(filter: (Fruit) -> Boolean) {

}


class Fruit(val name: String, val price: Int)

