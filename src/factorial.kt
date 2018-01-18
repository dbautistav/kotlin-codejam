fun factorial(n: Int): Int {
    var result = 1

    if (n in 0..1)
        result = n

    else {
        for (i in 2..n)
            result *= i
    }

    return result
}

fun main(args: Array<String>) {
    println(factorial(3))
    println(factorial(5))
    println(factorial(10))
}
