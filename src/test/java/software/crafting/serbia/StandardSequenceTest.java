package software.crafting.serbia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StandardSequenceTest {

  private static final Player FIRST_PLAYER = new Player('X');
  private static final Player SECOND_PLAYER = new Player('O');
  private static final Player THIRD_PLAYER = new Player('X');

  private PlayerSequence sequence;

  @BeforeEach
  void setUp() {
    sequence = new StandardSequence();
  }

  @Test
  @DisplayName("First player should be X")
  void firstPlayerShouldBeX() {

    // When
    Player player = sequence.current();

    // Then
    assertThat(player)
        .isEqualTo(FIRST_PLAYER);

  }

  @Test
  @DisplayName("Second player should be O")
  void secondPlayerShouldBeO() {

    // When
    sequence.next();
    Player player = sequence.current();

    // Then
    assertThat(player)
        .isEqualTo(SECOND_PLAYER);

  }

  @Test
  @DisplayName("A third player should be X")
  void thirdPlayerShouldBeX() {

    // When
    sequence.next();
    sequence.next();
    Player player = sequence.current();

    // Then
    assertThat(player)
        .isEqualTo(THIRD_PLAYER);

  }
}
