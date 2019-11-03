package software.crafting.serbia;

import java.util.Objects;

class Move {

  private final int row;
  private final int column;
  private final char player;

  public Move(int row, int column, char player) {
    this.row = row;
    this.column = column;
    this.player = player;
  }

  public int getRow() {
    return row;
  }

  public int getColumn() {
    return column;
  }

  public char getPlayer() {
    return player;
  }

  @Override
  public String toString() {
    return "Move{" +
        "row=" + row +
        ", column=" + column +
        ", player=" + player +
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
    return row == move.row &&
        column == move.column &&
        player == move.player;
  }

  @Override
  public int hashCode() {
    return Objects.hash(row, column, player);
  }
}
