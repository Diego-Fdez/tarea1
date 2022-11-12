public class Class09 {
  public static void main(String[] args) {

    electricCar car = new electricCar();
    car.maxSpeed = 14;
    car.id = "CR123";
    car.color = "Red";

    System.out.println(car.checkId("CR111"));
  }

}

abstract class Car {
  int maxSpeed;
  String id;
  int doors;
  String color;

  public int getDoors() {
    return this.doors;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  abstract public String getColor();

  abstract public void setColor(String color);

  public boolean checkId(String id) {
    if (id == "CR123") {
      return true;
    }
    return false;
  }
}

class electricCar extends Car {
  public String getColor() {
    return "the color is:" + this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

}

// poliformismo
class Motor extends Car {
  String motor;

  public String getColor() {
    return "the color is:" + this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean checkId(String id) {
    if (id != "CR123") {
      return true;
    }
    return false;
  }

}

// interfaces
interface ICar {
  void speedUp(int speed);

  void speedDown(int speed);
}

class newCar implements ICar {
  public void speedUp(int speed) {

  }

  public void speedDown(int speed) {
  }
}