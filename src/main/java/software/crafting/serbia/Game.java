package software.crafting.serbia;

public class Game {

  private final Board board;

  public Game(Board board) {
    this.board = board;
  }

  public void playerX(int column, int row) {
    board.addMove(new Move(row, column, 'X'));
  }

  public void playerO(int column, int row) {
    board.addMove(new Move(row, column, 'O'));
  }

  @Override
  public String toString() {
    return board.toString();
  }
}
