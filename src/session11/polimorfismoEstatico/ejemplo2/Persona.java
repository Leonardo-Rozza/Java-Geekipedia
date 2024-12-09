package session11.polimorfismoEstatico.ejemplo2;

public class Persona {
  private String nombre;
  private int edad;

  //Sobrecarga de constructores
  public Persona() {
    this("Desconocido", 0);
  }

  public Persona(String nombre) {
    this(nombre, 0);
  }

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  //Getter and Setters

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

  //Metodo de comportamiento
  public void mostrarInformacion(){
    System.out.println("Nombre: " + nombre + "\nedad: " + edad + "\n");
  }
}
