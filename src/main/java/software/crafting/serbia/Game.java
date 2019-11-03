package software.crafting.serbia;

public class Game {

  private final Board board;

  private Character nextPlayer = 'X';

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
    if (nextPlayer.equals('X')) {
      playerX(column, row);
      nextPlayer = 'O';
    } else {
      playerO(column, row);
      nextPlayer = 'X';
    }
  }

  @Override
  public String toString() {
    return board.toString();
  }
}
