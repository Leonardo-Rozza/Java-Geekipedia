package session10;

//SuperClase
public class Persona {
  //Atributos
  private String nombre;

  //Constructor
  public Persona(String nombre) {
    this.nombre = nombre;
  }

  //Getters y Setters

  //Metodo de comportamiento
  public  void presentarse(){
    System.out.println("Hola, mi nombre es: " + nombre + ".");
  }
}
