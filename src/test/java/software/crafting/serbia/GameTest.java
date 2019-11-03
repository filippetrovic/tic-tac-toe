package software.crafting.serbia;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class GameTest {

  @Mock
  private Board board;

  @InjectMocks
  private Game game;

  @Test
  @DisplayName("Should add player X's move to board when the board is empty")
  void shouldAddPlayerXMoveToBoardWhenBoardIsEmpty() {

    // When
    game.playerX(0, 0);

    // Then
    verify(board).addMove(0, 0);

  }

}
