
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class EmptyTest {

  @Test
  public void shouldFail() {

    var a = 3;

    assertThat(a)
        .isEqualTo(5);

  }
}
