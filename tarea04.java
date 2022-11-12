public class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.setEdad(35);
    System.out.println(cliente.getEdad());
    cliente.setNombre("Diego");
    System.out.println(cliente.getNombre());
    cliente.setTelefono(83215708);
    System.out.println(cliente.getTelefono());
    cliente.setCredito(100);
    System.out.println(cliente.getCredito());

    Trabajador trabajador = new Trabajador();
    trabajador.setSalario(100);
    System.out.println(trabajador.getSalario());
  }

}

class Persona {
  int edad;
  String nombre;
  int telefono;

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getTelefono() {
    return telefono;
  }

  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }

}

class Cliente extends Persona {
  int credito;

  public int getCredito() {
    return credito;
  }

  public void setCredito(int credito) {
    this.credito = credito;
  }
}

class Trabajador extends Persona {
  int salario;

  public int getSalario() {
    return salario;
  }

  public void setSalario(int salario) {
    this.salario = salario;
  }
}