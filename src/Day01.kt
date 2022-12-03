import java.io.File

fun main() {
    fun parseInput(input: String): List<List<Int>> {
        val data = input.split("\r\n\r\n").map { elf ->
            elf.lines().map { it.toInt() }
        }
        return data
    }

    fun part1(input: String): Int {
        //why is this coming in as \r\n...?
        val data = parseInput(input)
        //            elf.split("\n").map { it.toInt() } }

        return data.maxOf { it.sum() }
    }

    fun part2(input: String): Int {
        return parseInput(input).map { it -> it.sum() }.sortedDescending().take(3).sum()
    }

    // test if implementation meets criteria from the description, like:
    val testInput = File("src/Day01_test.txt").readText()
    val input = File("src/Day01.txt").readText()

//    check(part1(testInput) == 24000)

    println(part1(testInput))
    println(part2(input))
}
