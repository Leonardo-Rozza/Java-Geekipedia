package sesion2.ejercicio1;

public class Persona {

  //Paso 1 -Atributos
  private String nombre;
  private int edad;

  //Paso 2- Constructor Parametrizado
  public Persona(String nombre, int edad) { //Parametros.
    this.nombre = nombre;
    this.edad = edad;
  }

  //Paso 3- Getters y Setters
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

  //Paso 4 -Métodos de comportamiento
  public void saludar (){
    System.out.println("Buenas! Mi nombre es " + this.nombre + " y tengo " + this.edad + " años.");
  }

}
