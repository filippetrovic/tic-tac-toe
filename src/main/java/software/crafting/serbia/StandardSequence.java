package software.crafting.serbia;

public class StandardSequence implements PlayerSequence {

  private static final char PLAYER_X = 'X';
  private static final char PLAYER_O = 'O';
  private Character previousPlayer = PLAYER_O;

  @Override
  public Character next() {
    Character nextPlayer = getNextAfter(previousPlayer);

    previousPlayer = nextPlayer;

    return nextPlayer;
  }

  private char getNextAfter(Character player) {
    return player.equals(PLAYER_X) ? PLAYER_O : PLAYER_X;
  }
}