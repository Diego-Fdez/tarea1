public class Class8 {
  public static void class8(String[] args) {
    NewCar car = new NewCar();
    car.setName("Ford");
    String name = car.getName();
    System.out.println(name);
    car.setMaxSpeed(100);
  }
}

class NewCar {
  private String name;
  private int maxSpeed;

  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}