package software.crafting.serbia;

public class StandardSequence implements PlayerSequence {

  private static final char PLAYER_X_NAME = 'X';
  private static final char PLAYER_O_NAME = 'O';

  private static final Player PLAYER_O = new Player(PLAYER_O_NAME);
  private static final Player PLAYER_X = new Player(PLAYER_X_NAME);

  private Player current = PLAYER_X;

  @Override
  public Player next() {
    current = getNextAfter(current);

    return current;
  }

  @Override
  public Player current() {
    return current;
  }

  private Player getNextAfter(Player current) {
    return current.equals(PLAYER_X) ? PLAYER_O : PLAYER_X;
  }
}