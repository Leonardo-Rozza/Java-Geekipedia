package session10;

public class Gerente extends Empleado {

  public Gerente(String nombre, String puesto) {
    super(nombre, puesto);
  }

  @Override
  public void presentarse(){
    super.presentarse();
    System.out.println("Para mi es un gusto atenderte.");
  }
}
