fun foo(): String {
    println("Calculating....")
    return "foo"
}

fun max(a: Int, b: Int) = if (a > b) a else b
fun main (args: Array<String>) {
    val name =  if (args.isNotEmpty()) args[0] else "Kotlin";
    println("Hello, $name!")

    println("Hello, ${args.getOrNull(0)}!")

    println("Hello, ${foo()} ${foo()}!")

    val list = listOf("Java")

    println(list)
    println(max(1,3))
}