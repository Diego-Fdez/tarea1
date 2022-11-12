class Main {
  public static void main(String[] args) {
    int result = 0;
    result = sum(4, 5, 6);
    System.out.print(result);

    Carro miCarro = new Carro();
    miCarro.addDoor();
    System.out.print(miCarro.puertas);
  }

  public static int sum(int a, int b, int c) {
    return a + b + c;
  }
}

class Carro {
  int puertas;

  public Carro() {
    puertas = 4;
  }

  public void addDoor() {
    puertas += 1;
  }

}
