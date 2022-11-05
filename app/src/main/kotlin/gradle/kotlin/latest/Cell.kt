package gradle.kotlin.latest

enum class CellStatus {
    Alive,
    Dead
}

class Cell(dead: CellStatus) {
    fun evolve(amountOfNeighbors: Int): Cell {
        TODO("Not yet implemented")
    }

}
