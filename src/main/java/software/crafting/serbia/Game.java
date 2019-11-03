package software.crafting.serbia;

public class Game {

  private static final char PLAYER_X = 'X';
  private static final char PLAYER_O = 'O';

  private final Board board;

  private Character nextPlayer = PLAYER_X;

  public Game(Board board) {
    this.board = board;
  }

  public void playerX(int column, int row) {
    board.addMove(new Move(row, column, 'X'));
  }

  public void playerO(int column, int row) {
    board.addMove(new Move(row, column, 'O'));
  }

  public void takeMove(int column, int row) {
    if (nextPlayer.equals(PLAYER_X)) {
      playerX(column, row);
      nextPlayer = PLAYER_O;
    } else {
      playerO(column, row);
      nextPlayer = PLAYER_X;
    }
  }

  @Override
  public String toString() {
    return board.toString();
  }
}
