package software.crafting.serbia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TicTacToeAcceptanceTest {

  private static final Player PLAYER_X = new Player("X", new PositionProvider());
  private static final Player PLAYER_O = new Player("O", new PositionProvider());

  private StandardSequence ticTacToeSequence;

  @BeforeEach
  void setUp() {
    ticTacToeSequence = new StandardSequence(PLAYER_X, PLAYER_O);
  }

  @Test
  @DisplayName("New game has empty board")
  void emptyGame() {

    // given
    Game game = new Game(new Board(), ticTacToeSequence);

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
    Game game = new Game(new Board(), ticTacToeSequence);

    // when
    game.takeMove(0, 0);

    // then
    assertThat(game.toString())
        .isEqualTo("X _ _\n_ _ _\n_ _ _");

  }

  @Test
  @DisplayName("Player X and O Can Take moves one after another")
  void playerXAndOCanTakeMovesOneAfterAnother() {

    // given
    Game game = new Game(new Board(), ticTacToeSequence);

    // when
    game.takeMove(0, 0);
    game.takeMove(1, 1);
    game.takeMove(2, 2);
    game.takeMove(2, 0);

    // then
    assertThat(game.toString())
        .isEqualTo("X _ O\n_ O _\n_ _ X");

  }

  @Test
  @DisplayName("Same move can be taken only once")
  @Disabled
  void moveCanBeTakenOnlyOnce() {

    // given
    Game game = new Game(new Board(), ticTacToeSequence);

    // when
    game.takeMove(0, 0);
    game.takeMove(0, 0);
    game.takeMove(2, 2);

    // then
    assertThat(game.toString())
        .isEqualTo("X _ _\n_ _ _\n_ _ O");

  }

}
