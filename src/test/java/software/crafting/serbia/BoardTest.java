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
    board.addMove(new Move(0, 0, new Player('X')));

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
    board.addMove(new Move(2, 0, new Player('O')));

    // Then
    assertThat(board.toString())
        .isEqualTo("_ _ _\n_ _ _\nO _ _");
  }

  @Test
  @DisplayName("Should return valid string representation of board after a move in the middle of the board")
  void shouldReturnValidStringRepresentationAfterAMoveInTheMiddle() {
    // Given
    Board board = new Board();

    // When
    board.addMove(new Move(1, 1, new Player('X')));

    // Then
    assertThat(board.toString())
        .isEqualTo("_ _ _\n_ X _\n_ _ _");
  }

  @Test
  @DisplayName("Should return valid string representation of board after multiple moves on a board")
  void shouldReturnValidStringRepresentationAfterMultipleMoves() {
    // Given
    Board board = new Board();

    // When
    board.addMove(new Move(1, 1, new Player('X')));
    board.addMove(new Move(0, 0, new Player('O')));
    board.addMove(new Move(2, 0, new Player('X')));
    board.addMove(new Move(1, 0, new Player('O')));

    // Then
    assertThat(board.toString())
        .isEqualTo("O _ _\nO X _\nX _ _");
  }

  @Test
  @DisplayName("Should not allow players to play move on the same position")
  void shouldNotAllowPlayersToPlaySameMove() {
    // Given
    Board board = new Board();

    // When
    board.addMove(new Move(0, 0, new Player('X')));
    board.addMove(new Move(0, 0, new Player('O')));

    // Then
    assertThat(board.toString())
        .isEqualTo("X _ _\n_ _ _\n_ _ _");
  }

  @Test
  @DisplayName("Should return false on invalid move")
  void shouldReturnFalseOnInvalidMove() {
    // Given
    Board board = new Board();

    // When
    board.addMove(new Move(0, 0, new Player('X')));
    boolean played = board.addMove(new Move(0, 0, new Player('O')));

    // Then
    assertThat(played)
        .isFalse();
  }

}
