package software.crafting.serbia;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BoardTest {

  @Test
  @DisplayName("Should return valid string representation of board after one move")
  void shouldReturnValidStringRepresentationAfterOneMove() {
    // Given
    Board board = new Board();

    // When
    board.addMove(0, 0);

    // Then
    assertThat(board.toString())
        .isEqualTo("X _ _\n_ _ _\n_ _ _");

  }
}
