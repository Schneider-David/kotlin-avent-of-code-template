import java.io.File

//Nice straightforward way from blog by  byTodd Ginsberg
private val part1Scores: Map<String, Int> =
    mapOf(
        "A X" to 1 + 3,
        "A Y" to 2 + 6,
        "A Z" to 3 + 0,
        "B X" to 1 + 0,
        "B Y" to 2 + 3,
        "B Z" to 3 + 6,
        "C X" to 1 + 6,
        "C Y" to 2 + 0,
        "C Z" to 3 + 3,
    )
private val part2Scores: Map<String, Int> =
    mapOf(
        "A X" to 3 + 0,
        "A Y" to 1 + 3,
        "A Z" to 2 + 6,
        "B X" to 1 + 0,
        "B Y" to 2 + 3,
        "B Z" to 3 + 6,
        "C X" to 2 + 0,
        "C Y" to 3 + 3,
        "C Z" to 1 + 6,
    )

fun part1(input: List<String>): Int {


    return input.sumOf {
        part1Scores[it] ?: 0
    }
}

fun main() {

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")

    println(part1(testInput))
    println(testInput.sumOf { part2Scores[it] ?: 0 })
}