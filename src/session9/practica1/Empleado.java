package session9.practica1;

public class Empleado {
  //Atributos
  private String nombre;
  private int edad;

  //Constructor
  public Empleado(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  //Getters y Setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  //Métódo de comportamiento
  public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre + "\nEdad: " + edad);
  }
}
