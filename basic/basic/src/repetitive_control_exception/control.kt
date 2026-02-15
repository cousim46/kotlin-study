package repetitive_control_exception

/**
 * 자바에서 if-else는 Statement
 * 코틀린에서는 Expression
 *
 * Statement : 프로그램의 문장, 하나의 값으로 도출 X
 * Expression :  하나의 값으로 도출되는 문장
 *
 * 자바에서는 switch
 * 코틀린에서는 when
 *
 * when 사용법
 * when(값) {
 *   조건부 -> 구문
 *   조건부 ->  구문
 *   else -> 구문
 * }
 * 조건부는 어떠한 expression이라도 들어갈 수 있다(e.g. is Type)
 *
 * */
fun validateScoreIsNotNegative(score: Int) {
  if (score < 0) {
    throw IllegalArgumentException("${score} 보다 작을 수 없습니다.")
  }
}

fun getPassOrFail(score: Int): String {
  return if (score >= 50) {
    "P"
  } else {
    "F"
  }
}

fun rangeScore(score: Int) {
  if(score !in 0..10) {
    throw IllegalArgumentException("Score의 범위는 0부터 100입니다")
  }
}

fun getGradeWithSwitch(score: Int) : String {
  return when(score / 10) {
    in 9..99 -> "A"
    else -> "aa"
  }
}

fun useWhen(score: Int) {
  when {
    score == 90 -> println("90점")
    score == 80 -> println("80점")
    score == 70 -> println("70점")
    else -> println("재시험")
  }
}