package session11.polimorfismoDinamico.ejemplo1;

public class Desarrollador extends Empleado {
  //Atributos
  private String lenguaje;

  public Desarrollador(String nombre, int edad, String lenguaje) {
    super(nombre, edad);
    this.lenguaje = lenguaje;
  }

  public String getLenguaje() {
    return lenguaje;
  }

  public void setLenguaje(String lenguaje) {
    this.lenguaje = lenguaje;
  }

  @Override
  public void mostrarInformacion(){
    System.out.println("Soy el desarrollador" + getNombre());
    System.out.println("Tengo una edad de " + getEdad());
    System.out.println("Y actualmente estoy desarrollando en el lenguaje de" + this.lenguaje + "\n");
  }
}
