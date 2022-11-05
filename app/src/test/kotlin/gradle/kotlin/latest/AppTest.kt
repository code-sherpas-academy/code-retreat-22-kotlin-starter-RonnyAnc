package gradle.kotlin.latest

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CellShould {

    @Test
    fun remainDeadWhenLessThanTwoNeighborsAndItIsDead() {
        val cell = Cell(CellStatus.Dead);
        val amountOfNeighbors = 1

        val newCell = cell.evolve(amountOfNeighbors)

        assertThat(newCell).isEqualTo(Cell(CellStatus.Dead))
    }
}
