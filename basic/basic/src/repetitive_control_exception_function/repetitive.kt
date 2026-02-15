package repetitive_control_exception_function
/**
 * 코틀린에서 반복문 다루는 방법
 *
 * 자바
 * for(int i : list)
 *
 * 코틀린
 * for(i in list)
 *
 * 자바
 * for(int i = 0; i < list.size(); i+=2)
 *
 * 코틀린
 * for( i : 0..list.size step 2)
 *
 * 자바
 * for(int i = 5; i >= 0; i-=2)
 *
 * 코틀린
 * for(i in 5 downTo 2)
 *
 * step은 기본적으로 IntProgression에서 1로 설정 되어있음
 *
 * ".."은 Range를 구현하고 있음.
 *
 * downTo, step 은 중위 함수를 의미한다.
 * */
fun main() {

  val numbers = listOf(1,2,3,4,5)
  for(number in numbers) {
    println(number)
  }

  for(i in 0..numbers.size step 2) {
    println(numbers[i])
  }

  for(i in 5 downTo 2) {
    println(numbers[i])
  }
}