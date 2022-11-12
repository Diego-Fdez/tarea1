class Main {
  public static void main(String[] args) {
    Car car = new Car();
    System.out.println(car.currentSpeed);
    car.speedUp();
    System.out.println(car.currentSpeed);
    car.slowDown();

    Car newCar = new Car(5, 80);
    System.out.println(newCar.doorsCount);
    System.out.println(newCar.maxSpeed);
  }
}

class Car {
  int doorsCount;
  int maxSpeed;
  int currentSpeed;

  public Car() {
    doorsCount = 4;
    maxSpeed = 120;
  }

  public Car(int doors, int speed) {
    this.doorsCount = doors;
    this.maxSpeed = speed;
  }

  public void speedUp() {
    currentSpeed += 15;
  };

  public void slowDown() {
    currentSpeed -= 15;
  };
}
