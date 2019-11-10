package software.crafting.serbia;

public class Game {

  private final Board board;
  private final PlayerSequence playerSequence;

  public Game(Board board, PlayerSequence playerSequence) {
    this.board = board;
    this.playerSequence = playerSequence;
  }

  public void takeMove() {
    takeMove(0, 0);
  }

  public void takeMove(int column, int row) {

    Player player = playerSequence.current();

    player.takeMoveOn(column, row, board);

    playerSequence.next();
  }

  @Override
  public String toString() {
    return board.toString();
  }
}
