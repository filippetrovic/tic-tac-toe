package software.crafting.serbia;

public class Game {

  private final Board board;
  private final PlayerSequence playerSequence = new PlayerSequence();

  public Game(Board board) {
    this.board = board;
  }

  public void takeMove(int column, int row) {
    Character player = playerSequence.next();

    board.addMove(new Move(row, column, player));
  }

  @Override
  public String toString() {
    return board.toString();
  }
}
