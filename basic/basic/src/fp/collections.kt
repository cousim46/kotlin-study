package fp

/**
 * 다양한 컬렉쳔 처리
 * all : 조건을 모두 만족하면 true, 그렇지 않으면 false
 * none : 조건을 모두 불만족하면 true, 그렇지 않으면 false
 * any : 조건을 하나라도 만족하면 true, 그렇지 않으면 false
 *
 * */

fun main() {
  val listOf = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
  listOf.filter { it -> it % 2 == 0 } //짝수 부분만
  listOf.all { it -> it % 2 == 1 }// 모두 홀수이면 true 반환
  listOf.any { it -> it % 2 == 1 }// 하나라도 홀수이면 true 반환
  listOf.none { it -> it % 2 == 1 }// 홀수가 존재하지 않으면 true, 존재하면 false
  listOf.filterIndexed { index, value -> index % 2 == 1  } // 홀수 인덱스만 조회
  listOf.groupBy { it } // 값으로 groupBy

}