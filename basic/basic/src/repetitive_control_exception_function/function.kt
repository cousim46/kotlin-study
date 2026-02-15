package repetitive_control_exception_function

/**
 * 코틀린에서 함수를 다루는 방법
 *
 * default parameter
 *
 * 자바에서는 메서드를 사용할때 불필요한 매개변수 때문에 오버로딩을 통해 메서드를 새롭게 만들어야합니다.
 * public void test(int age, String name, boolean isAgree)
 *
 * 코틀린에서는 불필요한 매개변수로 인해 굳이 새롭게 메서드를 만들필요 없습니다. 기본으로 해당 매개변수의 값을 설정할 수 있습니다.
 *
 * fun test(age:Int, name: String, isAgree: Boolean = false)
 *
 * named parameter
 * 자바에서는 메서드를 사용할때 순서에 알맞게 매개변수의 값을 넣어줘야합니다.
 *
 * 코틀린에서는 메서드를 사용할때 매개변수명을 지정하여 값을 넣을 수 있습니다.
 * test(age = 2, name="name", isAgree=true)
 *
 * 가변 인자
 * 자바에서는 가변인자를  넣을때 "..."을 사용합니다.
 *
 * 코틀린에서는 가변인자를 넣을때 맨앞에 vararg를 사용합니다.
 * */

fun main() {

  nameMethod(age = 3, name = "name", isAgree = true)
  varargMethod("name1", "name2")
}
fun defalutMethod(age: Int, name: String, isAgree: Boolean = false){

}

fun nameMethod(age: Int, name: String, isAgree: Boolean)
{

}

fun varargMethod(vararg strings: String) {
  for (string in strings) {

  }
}