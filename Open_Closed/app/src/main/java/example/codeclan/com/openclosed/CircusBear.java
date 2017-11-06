package example.codeclan.com.openclosed;

/**
 * Created by user on 27/06/2017.
 */

public class CircusBear extends Bear {

  // these methods will break - I have to eat Salmon
  // The Bear can't be extended into a CircusBear and eat fun Circus things.
  public void eat(Food food) {
    super.eat(food);
  }

}
