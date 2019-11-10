package software.crafting.serbia;

import java.util.Objects;

public class Player {

  private final String name;
  private final PositionProvider positionProvider;

  public Player(String name, PositionProvider positionProvider) {
    this.name = name;
    this.positionProvider = positionProvider;
  }

  public void takeMoveOn(Board board) {
    board.addMove(getMove(0, 0));
  }

  public void takeMoveOn(int column, int row, Board board) {
    board.addMove(getMove(column, row));
  }

  public Move getMove(int column, int row) {
    return new Move(
        positionProvider.position(column, row),
        this);
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Player{" +
        "name=" + name +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Player player = (Player) o;
    return name == player.name;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
