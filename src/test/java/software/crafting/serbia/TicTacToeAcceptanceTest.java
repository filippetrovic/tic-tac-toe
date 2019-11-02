package software.crafting.serbia;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TicTacToeAcceptanceTest {

  @Test
  @DisplayName("New game has empty board")
  void emptyGame() {

    // given
    Game game = new Game();

    // when
    Board board = game.getBoard();

    // then
    assertThat(board.toString())
        .isEqualTo("_ _ _\n_ _ _\n_ _ _");

  }

  @Test
  @DisplayName("Player X Can Take a Move")
  @Disabled
  void playerXCanTakeAMove() {

    // given
    Game game = new Game();

    // when
    game.playerX(0, 0);

    // then
    Board board = game.getBoard();

    assertThat(board.toString())
        .isEqualTo("X _ _\n_ _ _\n_ _ _");

  }

}
