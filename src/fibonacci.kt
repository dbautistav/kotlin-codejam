fun fibonacci(n: Int): Int {
    var result = 0

    if (n in 0..1)
        result = n

    else {
        var a = 0
        var b = 1

        for (i in 1.. n - 1) {
            if (i % 2 != 0) {
                a = a + b
                result = a

            } else {
                b = a + b
                result = b
            }
        }
    }

    return result
}

////  recursive approach
//fun fibonacci(n: Int): Int {
//    if (n in 0..1)
//        return n
//
//    else
//        return fibonacci(n - 1) + fibonacci(n - 2)
//}

fun main(args: Array<String>) {
    println(fibonacci(0))
    println(fibonacci(1))
    println(fibonacci(2))
    println(fibonacci(3))

    println(fibonacci(8))
    println(fibonacci(7))
    println(fibonacci(25))
    println(fibonacci(30))
}
