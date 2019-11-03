package software.crafting.serbia;

public class Board {

  private int column = -1;
  private int row = -1;

  @Override
  public String toString() {
    if (column == 0 && row == 0) {
      return "X _ _\n_ _ _\n_ _ _";
    }
    if (column == 0 && row == 2) {
      return "_ _ _\n_ _ _\nX _ _";
    }
    return "_ _ _\n_ _ _\n_ _ _";
  }

  public void addMove(int column, int row) {
    this.column = column;
    this.row = row;
  }
}
