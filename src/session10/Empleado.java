package session10;

public class Empleado extends Persona {

  private String puesto;

  public Empleado(String nombre, String puesto) {
    super(nombre);
    this.puesto = puesto;
  }

  @Override
  public void presentarse(){
    super.presentarse();
    System.out.println("Estoy trabajando, y mi puesto es: " + puesto);
  }
}
