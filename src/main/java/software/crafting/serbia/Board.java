package software.crafting.serbia;

import java.util.LinkedList;
import java.util.List;

public class Board {

  private static final String EMPTY_BOARD = "_ _ _\n_ _ _\n_ _ _";

  private List<Integer> columns = new LinkedList<>();
  private List<Integer> rows = new LinkedList<>();
  private List<Character> players = new LinkedList<>();

  @Override
  public String toString() {
    if (columns.isEmpty() || rows.isEmpty()) {
      return EMPTY_BOARD;
    }

    final StringBuilder stringBuilder = new StringBuilder(EMPTY_BOARD);
    stringBuilder.setCharAt(
        rows.get(0) * "_ _ _\n".length() + columns.get(0) * "_ ".length(),
        players.get(0));
    return stringBuilder.toString();
  }

  public void addMove(int column, int row, char player) {
    this.columns.add(column);
    this.rows.add(row);
    this.players.add(player);
  }
}
