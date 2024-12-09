package session11.polimorfismoDinamico.ejemplo2;

public class Camion extends Vehiculo{

  //Atributos
  private double capacidadDeCarga;

  public Camion(String marca, double capacidadDeCarga) {
    super(marca);
    this.capacidadDeCarga = capacidadDeCarga;
  }

  public double getCapacidadDeCarga() {
    return capacidadDeCarga;
  }

  public void setCapacidadDeCarga(double capacidadDeCarga) {
    this.capacidadDeCarga = capacidadDeCarga;
  }

  //metodo de comportamiento
  @Override
  public void mover(){
    System.out.println("El camion esta transportando carga pesada.");
  }

  @Override
  public void mostrarInformacion(){
    super.mostrarInformacion();
    System.out.println("La capacidad de carga del camion es: " + this.capacidadDeCarga + " toneladas.");
  }
}
