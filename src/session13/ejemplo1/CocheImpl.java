package session13.ejemplo1;

public class CocheImpl implements Vehiculo {
  private int velocidad;

  @Override
  public void arrancar() {

  }

  @Override
  public void detener() {

  }

  @Override
  public void acelerar(int incremento) {
    this.velocidad += incremento;
    System.out.println("El auto acelero, su velocidad actual es: " + velocidad + "Km/h");
  }
}
