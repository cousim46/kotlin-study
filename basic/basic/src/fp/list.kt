package fp


/**
 * 코틀린에서 배열과 컬렉션을 다루는 방법
 *
 * get을 통해서 인덱스에 접근하여 데이터를 조회가능 -> 코틀린에서는 get 말고 배열[인덱스]을 통해서 데이터를 접근할 수 있음
 *
 * 배열.indices을 하게 되면 index를 순차적으로 접근할 수 있음
 *
 * 배열.withIndex을 하게 되면 인덱스와 값을 함께 조회할 수 잇음
 *
 *컬렉션
 * 코틀린에서는 자바와 다르게 컬렉션을 불변, 가변을 구분해서 컬렉션을 생성.
 * mutableXxx -> 가변
 * 기존 -> 불변
 *
 * 불변같은 경우에는 리스트에 추가 및 삭제가 불가능하지만 컬렉션안에 존재하는 객체의 값을 변경하는건 가능
 *
 * 가변 : 추가 및 삭제 가능
 *
 * Map 값 초기화 및 추가하는 방법
 * 1. mapOf<Int, String>(1 to "one", 2 to "two")
 * 2.val mutableMapOf = mutableMapOf<Int, String>()
 *   mutableMapOf.put(1, "one")
 * 3.val mutableMapOf = mutableMapOf<Int, String>()
 *   mutableMapOf[1] = "one"
 *
 * 컬렉션 null을 다루는 방법
 * 1. List<Int?> : List는 null일 수 없지만 값을 null일 수 있음
 * 2. List<Int?>? : List와 값이 null일 수 있음
 * 3. List<Int>? : List는 null일 수 있지만 값이 null일 수 없음
 * */

fun main() {
  val arr = arrayOf(10,20);
  arr.get(0)
  for (i in arr.indices) {
    println("index = ${i}, value = ${arr[i]}")
  }
  for ((index, value) in arr.withIndex()) {
    println("index = ${index}, value = ${value}")
  }

  val mutableMapOf = mutableMapOf<Int, String>()
  mutableMapOf[1] = "one"
}