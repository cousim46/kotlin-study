package repetitive_control_exception_function

import java.io.FileInputStream

/**
 * 코틀린에서 예외를 다루는 방법
 *
 * 자바에서는 Checked Exception, UnChecked Exception이 있음.
 * 코틀렌에서는 Checked Exception, UnChecked Exception을 구분짓지 않고 UnChecked Exception으로 사용
 *
 *
 * 자바에서의 try-with-resources이 있지만
 * 코틀린에서는 try-with-resources가 없음
 * */

fun main() {
  // FileInputStream에서는 내부에서 throws FileNotFoundException을 발생시키지만 컴파일 에러가 발생하지 않음. 즉  코틀린은 UnChecekd Exception으로 되어있음
  val fileInputStream = FileInputStream("name")
  //코틀린에서는 try-with-resources가 따로 없음. use 내부를 보면 closeable를 상속받고 있음, 즉 use 메서드가 수행이 끝나면 try-with-resources처럼 동작
  fileInputStream.use {  }

}