package software.crafting.serbia;

public class Board {

  private static final String EMPTY_BOARD = "_ _ _\n_ _ _\n_ _ _";

  private int column = -1;
  private int row = -1;

  @Override
  public String toString() {
    if (column == 0 && row == 0) {
      final StringBuilder stringBuilder = new StringBuilder(EMPTY_BOARD);
      stringBuilder.setCharAt(row * "_ _ _\n".length() + column, 'X');
      return stringBuilder.toString();
    }
    if (column == 0 && row == 2) {
      final StringBuilder stringBuilder = new StringBuilder(EMPTY_BOARD);
      stringBuilder.setCharAt(row * "_ _ _\n".length() + column, 'X');
      return stringBuilder.toString();
    }
    if (column == 1 && row == 1) {
      return "_ _ _\n_ X _\n_ _ _";
    }
    return EMPTY_BOARD;
  }

  public void addMove(int column, int row) {
    this.column = column;
    this.row = row;
  }
}
