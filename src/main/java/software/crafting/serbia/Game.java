package software.crafting.serbia;

public class Game {

  private final Board board;

  public Game(Board board) {
    this.board = board;
  }

  public Board getBoard() {
    return board;
  }

  public void playerX(int column, int row) {
    board.addMove(column, row);
  }
}
