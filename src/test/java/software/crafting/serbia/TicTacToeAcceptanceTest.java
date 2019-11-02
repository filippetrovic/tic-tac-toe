package software.crafting.serbia;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TicTacToeAcceptanceTest {

  @Test
  @DisplayName("New game has empty board")
  void emptyGame() {

    Game game = new Game();

    Board board = game.getBoard();

    assertThat(board.toString())
        .isEqualTo("_ _ _\n_ _ _\n_ _ _");

  }
}
