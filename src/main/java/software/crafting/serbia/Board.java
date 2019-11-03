package software.crafting.serbia;

public class Board {

  private static final String EMPTY_BOARD = "_ _ _\n_ _ _\n_ _ _";

  private Integer column = -1;
  private Integer row = -1;
  private Character player;

  @Override
  public String toString() {
    if (column == -1 || row == -1) {
      return EMPTY_BOARD;
    }

    final StringBuilder stringBuilder = new StringBuilder(EMPTY_BOARD);
    stringBuilder.setCharAt(
        row * "_ _ _\n".length() + column * "_ ".length(),
        player);
    return stringBuilder.toString();
  }

  public void addMove(int column, int row, char player) {
    this.column = column;
    this.row = row;
    this.player = player;
  }
}
