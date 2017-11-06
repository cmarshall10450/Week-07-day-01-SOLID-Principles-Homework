package example.codeclan.com.interfacesegregation;


public class PandaBear extends Bear implements CanClimbTree {

  @Override
  public void climbTree() {

  }

  public void eat(Bamboo food) {
    super.eat(food);
  }
}
