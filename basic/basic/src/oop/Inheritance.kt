package oop

/**
 * final : 오버라이딩 불가능, default로 보이지 않게 존재
 * open : 오버라이딩을 열어준다.
 * abstract : 반드시 오버라이딩 해야함.
 * override : 상위 타입을 오버라이딩
 *
 * 상속할때는 자바에서는 extends 또는 implements를 사용하지만 코틀린에서는 ":" 사용
 * */

fun main() {
  val teacher: PersonInheritance = Teacher(name = "이름", age = 10)
  teacher.printJob()
  teacher.printPersonInfo()

  val student: Student = Student(name = "이름", age = 10)
  student.printJob()
  student.printPersonInfo()
  student.action()
}

abstract class PersonInheritance(
  protected val name: String,
  protected val age: Int,
  protected val job: String,
) {

  abstract fun printJob()
  fun printPersonInfo() {
    println("저의 이름은 ${name}이고 나이는 ${age} 직업은 ${job} 입니다.")
  }
}


class Student(name: String, age: Int) : PersonInheritance(name, age, "학생"), Walk, Run {
  override fun printJob() {
    println("저의 직업은 학생입니다.")
  }

  override fun action() {
    super<Walk>.action()
    super<Run>.action()
  }

}

class Teacher(name: String, age: Int) : PersonInheritance(name, age, "선생") {
  override fun printJob() {
    println("저의 직업은 선생입니다.")
  }
}

open class ParentClass(open val name: String)

class ChildClass(name: String) : ParentClass(name) {

  override val name = name
    get() = field.uppercase()
}

interface Walk  {
  fun action() {
    println("걷습니다.")
  }
}

interface Run {
  fun action() {
    println("뜁니다.")
  }
}

