package software.crafting.serbia;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TicTacToeAcceptanceTest {

  @Test
  @DisplayName("New game has empty board")
  void emptyGame() {

    // given
    Game game = new Game(new Board());

    // when
    // nothing

    // then
    assertThat(game.toString())
        .isEqualTo("_ _ _\n_ _ _\n_ _ _");

  }

  @Test
  @DisplayName("Player X Can Take a Move")
  void playerXCanTakeAMove() {

    // given
    Game game = new Game(new Board());

    // when
    game.playerX(0, 0);

    // then
    assertThat(game.toString())
        .isEqualTo("X _ _\n_ _ _\n_ _ _");

  }

  @Test
  @DisplayName("Player X and O Can Take multiple moves")
  void playerXAndOCanTakeMultipleMoves() {

    // given
    Game game = new Game(new Board());

    // when
    game.playerX(0, 0);
    game.playerO(1, 1);
    game.playerX(2, 2);
    game.playerO(2, 0);

    // then
    assertThat(game.toString())
        .isEqualTo("X _ O\n_ O _\n_ _ X");

  }

}
