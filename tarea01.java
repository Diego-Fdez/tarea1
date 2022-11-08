public class Main {
  public static void main(String[] args) {
    int result = 0;
    result = sum(a: 4, b: 5, c: 6);
    System.out.print(result);

    Carro miCarro = new Carro();
    miCarro.addDoor();
    System.out.print(miCarro.puertas);
  }

  public static int sum(int a, int b, int c) {
    return a + b + c;
  }
}

public class Carro {
  int puertas = 4;

  public static void addDoor() {
    this.puertas ++;
  }


}
