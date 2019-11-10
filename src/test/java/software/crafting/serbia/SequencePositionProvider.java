package software.crafting.serbia;

public class SequencePositionProvider implements PositionProvider {

  @Override
  public Position position(int column, int row) {
    return new Position(row, column);
  }

}