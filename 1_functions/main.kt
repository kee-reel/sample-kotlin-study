fun str_return(): String {
  return "Yo!"
}

fun str_return_one_line() = "Yo!"
// fun str_return_one_line(): String = "Yo!"

// Unit specification is redundant
fun no_return(): Unit {
  println("Yo!")
}

fun no_return_with_param(x: String) {
  //println("Hi, " + x)
  println("Hi, $x")
}

fun no_return_with_default_params(x: String = "X", y: String = "Y") {
  //println("Hi, " + x)
  println("Hi, $x")
}

fun main() {
  println(str_return())
  println(str_return_one_line())
  no_return()
  no_return_with_param("X")
  no_return_with_default_params()
  no_return_with_default_params(x="1")
  no_return_with_default_params(y="2")
  no_return_with_default_params(y="2", x="1")
}
