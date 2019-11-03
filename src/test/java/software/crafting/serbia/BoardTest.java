package software.crafting.serbia;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BoardTest {

  @Test
  @DisplayName("Should return valid string representation of board after a move in upper left corner")
  void shouldReturnValidStringRepresentationAfterOneMoveInTheUpperLeftCorner() {
    // Given
    Board board = new Board();

    // When
    board.addMove(0, 0);

    // Then
    assertThat(board.toString())
        .isEqualTo("X _ _\n_ _ _\n_ _ _");

  }

  @Test
  @DisplayName("Should return valid string representation of board after a move in lower left corner")
  void shouldReturnValidStringRepresentationAfterOneMoveInTheLowerLeftCorner() {
    // Given
    Board board = new Board();

    // When
    board.addMove(0, 2);

    // Then
    assertThat(board.toString())
        .isEqualTo("_ _ _\n_ _ _\nX _ _");
  }
}
