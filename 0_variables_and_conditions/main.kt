// val constant_value = "abc"
val constant_value: String = "abc"
var variable_value = "cba"
//var variable_value: String = "cba"
var nullable_value: String? = null
// Can't be:
// var nullable_value = null
// or
// var nullable_value: String = null

fun main() {
  val local_constant_value: String = "aabbcc"
  var local_variable_value: String
  variable_value = "123"
  local_variable_value = "321"
  println(constant_value)
  println(variable_value)
  println(local_constant_value)
  println(local_variable_value)
  println(nullable_value)
  nullable_value = "XXX"
  println(nullable_value)

  // if
  if(nullable_value == null) {
    println("Yes")
  } else {
    println("Yes")
  }
  // switch
  when(nullable_value) {
    null -> println("Yes")
    else -> println("No")
  }
  // switch without value
  when {
    nullable_value == null -> println("Yes")
    else -> println("No")
  }
  // ternary
  println(if(nullable_value == null) "Yes" else "No")
  println(when(nullable_value){
    null -> "Yes"
    else -> "No"
  })
}
