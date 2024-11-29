package session9.practica1;

public class Desarrollador extends Empleado {
  //Atributos
  private String lenguaje;
  private int experiencia;

  //Constructor
  public Desarrollador(String nombre, int edad, String lenguaje, int experiencia) {
    super(nombre, edad);
    this.lenguaje = lenguaje;
    this.experiencia = experiencia;
  }

  //Getters y Setters
  public String getLenguaje() {
    return lenguaje;
  }

  public void setLenguaje(String lenguaje) {
    this.lenguaje = lenguaje;
  }

  public int getExperiencia() {
    return experiencia;
  }

  public void setExperiencia(int experiencia) {
    this.experiencia = experiencia;
  }

  //Métódo de comportamiento
  @Override
  public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Lenguaje: "+lenguaje + "\nAños de experiencia: "+experiencia);
  }

}
