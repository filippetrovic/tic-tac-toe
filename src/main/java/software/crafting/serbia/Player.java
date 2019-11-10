package software.crafting.serbia;

import java.util.Objects;

public class Player {

  private final char name;

  public Player(char name) {
    this.name = name;
  }

  public void takeMoveOn(int column, int row, Board board) {
    board.addMove(getMove(column, row));
  }

  public Move getMove(int column, int row) {
    return new Move(row, column, this);
  }

  public char getName() {
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
