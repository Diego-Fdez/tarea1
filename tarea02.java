class Main {
  public static void main(String[] args) {
    // ejercicio #1
    int numeroIf = 2;

    if (numeroIf >= 0) {
      System.out.println("Numero positivo");
    } else {
      System.out.println("Numero negativo");
    }

    // ejercicio #2
    int numeroWhile = 1;
    while (numeroWhile < 3) {
      System.out.println(numeroWhile);
      numeroWhile++;
    }

    // ejercicio #3
    do {
      System.out.println(numeroIf);
    } while (numeroIf == 2);

    int numeroFor = 0;
    for (int i = 0; i <= 3; i++) {
      System.out.println(numeroFor);
      numeroFor++;
    }

    // ejercicio #4
    String estacion = "Verano";
    switch (estacion) {

      case "Invierno":
        System.out.println("Invierno");
        break;
      case "Primavera":
        System.out.println("Primavera");
        break;
      case "Verano":
        System.out.println("Verano");
        break;
      default:
        System.out.println("Otoño");
    }

  }
}