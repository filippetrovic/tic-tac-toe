package software.crafting.serbia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class GameTest {

  @Mock
  private Board board;

  private Game game;

  @BeforeEach
  void setUp() {
    game = new Game(board, new StandardSequence());
  }

  @Test
  @DisplayName("Should add player X's move to board when the board is empty")
  void shouldAddPlayerXMoveToBoardWhenBoardIsEmpty() {

    // When
    game.takeMove(0, 0);

    // Then
    verify(board).addMove(new Move(0, 0, 'X'));

  }

  @Test
  @DisplayName("Second move is for player O")
  void shouldTakeAMoveForPlayerOOnSecondMove() {

    // When
    game.takeMove(0, 0);
    game.takeMove(1, 1);

    // Then
    verify(board).addMove(new Move(1, 1, 'O'));

  }

  @Test
  @DisplayName("Should alternate players after each move")
  void shouldAddAlternatePlayersAfterEachMove() {

    // When
    game.takeMove(0, 0);
    game.takeMove(1, 0);
    game.takeMove(1, 2);

    // Then
    verify(board).addMove(new Move(0, 0, 'X'));
    verify(board).addMove(new Move(0, 1, 'O'));
    verify(board).addMove(new Move(2, 1, 'X'));

  }

}
