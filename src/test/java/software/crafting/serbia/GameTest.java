package software.crafting.serbia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
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
    verify(PLAYER).takeMoveOn(0, 0, board);

  }

  @Test
  @DisplayName("Should notify that round is done")
  void shouldNotifyThatRoundIsDone() {

    // When
    game.takeMove();

    // Then
    verify(sequence).next();

  }

}
