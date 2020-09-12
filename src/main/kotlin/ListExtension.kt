fun <T> singleton(input: T): List<T> = listOf(input)

fun <T> repeat(num: Int, input: T): List<T> {
    val list = mutableListOf<T>()
    for (i in 0 until num) {
        list.add(input)
    }
    return list.toList()
}

fun range(a: Int, b: Int): List<Int> = (a..b).toList()

fun <T> List<T>.append(list: List<T>): List<T> {
    val acc = this.toMutableList()
    acc.addAll(list)
    return acc
}


fun <T> List<List<T>>.concat(): List<T> {
    return this.fold(mutableListOf()) { acc, list ->
        acc.addAll(list)
        acc
    }
}

fun <T> List<T>.head(): T {
    return this[0]
}

fun <T> List<T>.tail(): T {
    return this[this.size - 1]
}

