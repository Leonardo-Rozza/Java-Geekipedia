package session11.polimorfismoDinamico.ejemplo2;

public class Coche extends Vehiculo {
  private int puertas;

  public Coche(String marca,int puertas) {
    super(marca);
    this.puertas = puertas;
  }

  public int getPuertas() {
    return puertas;
  }

  public void setPuertas(int puertas) {
    this.puertas = puertas;
  }

  //Metodo de comportamiento
  @Override
  public void mover(){
    System.out.println("El coche se esta moviendo sobre 4 ruedas");
  }

  @Override
  public void mostrarInformacion(){
    super.mostrarInformacion();
    System.out.println("Numeros de puertas: " + this.puertas);
  }
}
