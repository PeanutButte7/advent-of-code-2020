import java.io.File

fun main() {
    val input = File("src/input.txt").readLines().map { it.toInt() }

    // Vymyslel jsem novej způsob pojmenovávání proměnejch, u are welcome
    fun solveFirstPart() {
        for (i in input)
            for (ii in input)
                if (i + ii == 2020) {
                    println(i * ii)
                    return
                }
    }

    fun solveSecondPart() {
        for (i in input)
            for (ii in input)
                for (iii in input)
                    if (i + i + iii == 2020) {
                        println(i * ii * iii)
                        return
                    }
    }

    solveFirstPart()
    solveSecondPart()
}