package example.codeclan.com.liskov;

/**
 * Created by user on 27/06/2017.
 */

abstract class Shape {

  public String getFullName() {
    return "I'm drawing a " + this.getClass().getSimpleName().toLowerCase() + "!";
  }

}
