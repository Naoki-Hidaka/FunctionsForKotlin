fun List<String>.concat(): String =
    this.fold("") { acc, s ->
        acc.plus(s)
    }

fun List<String>.join(joiner: String): String {
    val length = this.size
    return this.foldIndexed("") { index, acc, s ->
        if(index != length - 1) {
            acc.plus(s).plus(joiner)
        } else {
            acc.plus(s)
        }
    }
}

fun String.words(): List<String> =
    this.replace("[\n\t]".toRegex(), "").replace("  ", " ").split(" ")

fun String.lines(): List<String> =
    this.split("\n".toRegex())


