package software.crafting.serbia;

public class StandardSequence implements PlayerSequence {

  private static final char PLAYER_X = 'X';
  private static final char PLAYER_O = 'O';

  private Character currentPlayer = PLAYER_X;

  @Override
  public Character next() {
    currentPlayer = getNextAfter(currentPlayer);

    return currentPlayer;
  }

  @Override
  public Player current() {
    return new Player(currentPlayer);
  }

  private char getNextAfter(Character player) {
    return player.equals(PLAYER_X) ? PLAYER_O : PLAYER_X;
  }
}