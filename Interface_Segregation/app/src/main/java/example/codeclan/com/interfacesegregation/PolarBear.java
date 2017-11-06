package example.codeclan.com.interfacesegregation;


public class PolarBear extends Bear implements CanClimbIceberg, CanIceFish {

  @Override
  public Seal iceFish() {
    return null;
  }

  @Override
  public void climbIceberg() {

  }

  public void eat(Salmon food) {
    super.eat(food);
  }
}
