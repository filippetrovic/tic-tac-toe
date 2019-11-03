package software.crafting.serbia;

public class Board {

  private static final String EMPTY_BOARD = "_ _ _\n_ _ _\n_ _ _";

  private int column = -1;
  private int row = -1;

  @Override
  public String toString() {
    if (column == -1 || row == -1) {
      return EMPTY_BOARD;
    }

    final StringBuilder stringBuilder = new StringBuilder(EMPTY_BOARD);
    stringBuilder.setCharAt(
        row * "_ _ _\n".length() + column * "_ ".length(),
        'X');
    return stringBuilder.toString();
  }

  public void addMove(int column, int row) {
    this.column = column;
    this.row = row;
  }
}
