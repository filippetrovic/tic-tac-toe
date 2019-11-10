package software.crafting.serbia;

import java.util.Objects;

class Move {

  private final Player player;
  private final Position position;

  public Move(Position position, Player player) {
    this.position = position;
    this.player = player;
  }

  public int getRow() {
    return position.getRow();
  }

  public int getColumn() {
    return position.getColumn();
  }

  public Position getPosition() {
    return position;
  }

  public char getPlayer() {
    return player.getName();
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
    return player.equals(move.player) &&
        position.equals(move.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(player, position);
  }
}
