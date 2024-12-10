package session12.ejemplo2;

public abstract class Empleado {
  //Atributos
  private String nombre;

  //Constructor
  public Empleado(String nombre) {
    this.nombre = nombre;
  }

  //Metodo abstracto
  public abstract double calcularSalario();

  //Getter
  public String getNombre() {
    return nombre;
  }
}
