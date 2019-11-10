package software.crafting.serbia;

public class PositionProvider {

  public PositionProvider() {
  }

  Position position(int column, int row) {
    return new Position(row, column);
  }
}