package software.crafting.serbia;

public class Game {

  private static final char PLAYER_X = 'X';
  private static final char PLAYER_O = 'O';

  private final Board board;

  private Character nextPlayer = PLAYER_O;

  public Game(Board board) {
    this.board = board;
  }

  public void takeMove(int column, int row) {
    nextPlayer = nextPlayer(nextPlayer);

    board.addMove(new Move(row, column, nextPlayer));
  }

  private char nextPlayer(Character nextPlayer) {
    return nextPlayer.equals(PLAYER_X) ? PLAYER_O : PLAYER_X;
  }

  @Override
  public String toString() {
    return board.toString();
  }
}
