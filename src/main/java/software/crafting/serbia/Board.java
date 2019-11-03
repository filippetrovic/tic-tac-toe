package software.crafting.serbia;

import java.util.LinkedList;
import java.util.List;

public class Board {

  private static final String EMPTY_BOARD = "_ _ _\n_ _ _\n_ _ _";

  private List<Move> moves = new LinkedList<>();

  @Override
  public String toString() {
    if (moves.isEmpty()) {
      return EMPTY_BOARD;
    }

    final StringBuilder stringBuilder = new StringBuilder(EMPTY_BOARD);
    stringBuilder.setCharAt(
        moves.get(0).getRow() * "_ _ _\n".length() + moves.get(0).getColumn() * "_ ".length(),
        moves.get(0).getPlayer());
    return stringBuilder.toString();
  }

  public void addMove(int column, int row, char player) {
    this.moves.add(new Move(row, column, player));
  }

  private class Move {

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
  }
}
