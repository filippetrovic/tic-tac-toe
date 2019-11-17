package software.crafting.serbia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GameTest {

  private static final Player PLAYER = mock(Player.class);

  @Mock
  private Board board;

  @Mock
  private PlayerSequence sequence;

  @InjectMocks
  private Game game;

  @BeforeEach
  void setUp() {
    when(sequence.current())
        .thenReturn(PLAYER);
  }

  @Test
  @DisplayName("Should invoke the player to take a move")
  void shouldInvokePlayerToTakeAMove() {

    // When
    game.takeMove();

    // Then
    verify(PLAYER).takeMoveOn(board);

  }

  @Test
  @DisplayName("Should alternate player when round is done")
  void shouldAlternatePlayerWhenRoundIsDone() {

    // given
    // valid move
    when(PLAYER.takeMoveOn(board))
        .thenReturn(true);

    // When
    game.takeMove();

    // Then
    verify(sequence).next();

  }

  @Test
  @DisplayName("Should not change player on invalid move")
  void shouldNotChangePlayerOnInvalidMove() {

    // Given
    // invalid move
    when(PLAYER.takeMoveOn(board))
        .thenReturn(false);

    // When
    game.takeMove();

    // Then
    verify(sequence, never()).next();

  }
}
