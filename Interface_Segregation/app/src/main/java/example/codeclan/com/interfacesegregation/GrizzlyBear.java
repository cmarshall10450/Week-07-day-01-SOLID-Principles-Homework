package example.codeclan.com.interfacesegregation;


public class GrizzlyBear extends Bear implements CanClimbRock, CanHarvestHoney {

  @Override
  public void climbRock() {
    return;
  }

  @Override
  public Honey harvestHoney() {
    return null;
  }

  public void eat(Honey food) {
    super.eat(food);
  }
}
