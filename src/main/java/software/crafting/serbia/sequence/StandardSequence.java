package software.crafting.serbia.sequence;

import software.crafting.serbia.Player;

public class StandardSequence implements PlayerSequence {

  private Player[] sequence;

  private int round = 0;

  public StandardSequence(Player... players) {
    sequence = players;
  }

  @Override
  public Player next() {
    round++;
    return current();
  }

  @Override
  public Player current() {
    return sequence[round % sequence.length];
  }

}