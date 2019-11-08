package software.crafting.serbia;

import java.util.LinkedList;
import java.util.List;

public class Board {

  private static final String EMPTY_BOARD = "_ _ _\n_ _ _\n_ _ _";

  private List<Move> moves = new LinkedList<>();

  @Override
  public String toString() {
    final StringBuilder stringBuilder = new StringBuilder(EMPTY_BOARD);

    for (Move move : moves) {
      stringBuilder.setCharAt(
          move.getRow() * "_ _ _\n".length() + move.getColumn() * "_ ".length(),
          move.getPlayer());
    }

    return stringBuilder.toString();
  }

  public void addMove(Move move) {

    if (!isAlreadyPlayed(move)) {
      moves.add(move);
    }

  }

  private boolean isAlreadyPlayed(Move move) {
    return moves.stream()
        .map(Move::getPosition)
        .anyMatch(position -> position.equals(move.getPosition()));
  }

}
