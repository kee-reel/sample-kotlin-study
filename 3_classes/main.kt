class Person0(_name: String, _age: Int) {
  val name: String
  val age: Int
  init {
    name = _name
    age = _age
  }
}

class Person1(_name: String = "Default", _age: Int = 42) {
  val name: String = _name
  val age: Int = _age
}

class Person2(var name: String, var age: Int) {
  var money: Int = 0
    get(){
      println("getting money value: $field")
      return field
    }
    set(value){
      field = value
      println("new money value: $field")
    }

  init{
    println("init0")
  }
  constructor(): this("Default", 42) {
    println("secondary constructor")
  }
  init{
    println("init1")
  }
  fun info() {
    println("${name}: ${age}")
  }
}

fun main() {
  var p0 = Person2("XxX", 666)
  var p1 = Person2()
  p0.info()
  p1.info()
  p1.money = 100
  if(p1.money > 0) {
    println("$$$")
  }
}
