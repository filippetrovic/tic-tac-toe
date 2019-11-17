package software.crafting.serbia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import software.crafting.serbia.board.Board;
import software.crafting.serbia.port.input.position.Position;
import software.crafting.serbia.port.input.position.PositionProvider;
import software.crafting.serbia.sequence.PlayerSequence;
import software.crafting.serbia.sequence.StandardSequence;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TicTacToeAcceptanceTest {

  @Mock
  private PositionProvider playerXMoves;

  @Mock
  private PositionProvider playerOMoves;

  private Game game;

  @BeforeEach
  void setUp() {
    PlayerSequence ticTacToeSequence = new StandardSequence(
        new Player("X", playerXMoves),
        new Player("O", playerOMoves));

    game = new Game(new Board(), ticTacToeSequence);
  }

  @Test
  @DisplayName("New game has empty board")
  void emptyGame() {

    // given
    // new gate

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
    when(playerXMoves.position())
        .thenReturn(new Position(0, 0));

    // when
    game.takeMove();

    // then
    assertThat(game.toString())
        .isEqualTo("X _ _\n_ _ _\n_ _ _");

  }

  @Test
  @DisplayName("Player X and O Can Take moves one after another")
  void playerXAndOCanTakeMovesOneAfterAnother() {

    // given
    when(playerXMoves.position())
        .thenReturn(
            new Position(0, 0),
            new Position(2, 2));

    when(playerOMoves.position())
        .thenReturn(
            new Position(1, 1),
            new Position(0, 2));

    // when
    game.takeMove();
    game.takeMove();
    game.takeMove();
    game.takeMove();

    // then
    assertThat(game.toString())
        .isEqualTo("X _ O\n_ O _\n_ _ X");

  }

  @Test
  @DisplayName("Player O should take a valid move from the second attempt")
  void playerOShouldTakeValidMoveFromTheSecondAttempt() {

    // given
    when(playerXMoves.position())
        .thenReturn(
            new Position(0, 0));

    when(playerOMoves.position())
        .thenReturn(
            new Position(0, 0),
            new Position(1, 1));

    // when
    game.takeMove();
    game.takeMove();
    game.takeMove();

    // then
    assertThat(game.toString())
        .isEqualTo("X _ _\n_ O _\n_ _ _");

  }

}
