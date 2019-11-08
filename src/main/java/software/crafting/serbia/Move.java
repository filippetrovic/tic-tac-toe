package software.crafting.serbia;

import java.util.Objects;

class Move {

  private final char player;
  private final Position position;

  public Move(int row, int column, char player) {
    this.position = new Position(row, column);
    this.player = player;
  }

  public int getRow() {
    return position.getRow();
  }

  public int getColumn() {
    return position.getColumn();
  }

  public char getPlayer() {
    return player;
  }

  @Override
  public String toString() {
    return "Move{" +
        "player=" + player +
        ", position=" + position +
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
    Move move = (Move) o;
    return player == move.player &&
        position.equals(move.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(player, position);
  }
}
