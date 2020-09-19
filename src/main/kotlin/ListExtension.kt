fun <T> singleton(input: T): List<T> = listOf(input)

fun <T> repeat(count: Int, input: T): List<T> {
    val list = mutableListOf<T>()
    for (i in 0 until count) {
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

fun <T, R> List<T>.myMap(operation: (T) -> R): List<R> =
        this.fold(mutableListOf()) { acc, t ->
            acc.add(operation(t))
            acc
        }

fun <T> List<T>.myFilter(operation: (T) -> Boolean): List<T> =
        this.fold(mutableListOf()) { acc, t ->
            if (operation(t)) acc.add(t)
            acc
        }

fun <T, R> List<T>.indexedMap(operation: (Int, T) -> R): List<R> =
        this.foldIndexed(mutableListOf()) { index, acc, t ->
            acc.add(operation(index, t))
            acc
        }

fun List<Int>.sum() : Int =
        this.fold(0) { acc, number ->
            acc.plus(number)
        }
