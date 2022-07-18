fun no_return_with_param(values: List<String>) {
  values.forEach{ v ->
    println("Hi, $v")
  }
}

fun vararg_params(vararg values: String) {
  values.forEach{ v ->
    println("Hi, $v")
  }
}

fun main() {
  val words = arrayOf("Cat", "Box", "Cloud")
  println(words)
  println(words.size)
  println(words[0])
  println(words.get(0))
  for(word in words) {
    println(word)
  }
  words.forEach{
    println(it)
  }
  words.forEach{ word ->
    println(word)
  }
  words.forEachIndexed{ i, word ->
    println("$i: $word")
  }

  val colors = listOf("Red", "Green", "Blue")
  colors.forEach{
    println(it)
  }

  val number_to_color = mapOf(
    1 to "Red",
    2 to "Green",
    3 to "Blue"
  )
  number_to_color.forEach{ key, value ->
    println("$key: $value")
  }
  
  val mutableCountries = mutableListOf("Russia", "Ukraine")
  mutableCountries.add("Belorussia")

  val mutableFood = mutableMapOf(1 to "Rice")
  mutableFood.put(2, "Tomato")

  no_return_with_param(mutableCountries)
  val letters = arrayOf("A", "B", "C")
  vararg_params("A", "B", "C")
  vararg_params(*letters)
}
