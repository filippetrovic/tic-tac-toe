package software.crafting.serbia;

public class Game {

  private final Board board;
  private final PlayerSequence playerSequence;

  public Game(Board board, PlayerSequence playerSequence) {
    this.board = board;
    this.playerSequence = playerSequence;
  }

  public void takeMove() {
    Player player = playerSequence.current();

    player.takeMoveOn(board);

    playerSequence.next();
  }

  @Override
  public String toString() {
    return board.toString();
  }
}
