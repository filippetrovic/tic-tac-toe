package software.crafting.serbia;

public class Game {

  private final Board board;
  private final PlayerSequence playerSequence;

  public Game(Board board, PlayerSequence playerSequence) {
    this.board = board;
    this.playerSequence = playerSequence;
  }

  public void takeMove(int column, int row) {
    Character player = playerSequence.current();

    board.addMove(new Move(row, column, new Player(player)));

    playerSequence.next();
  }

  @Override
  public String toString() {
    return board.toString();
  }
}
