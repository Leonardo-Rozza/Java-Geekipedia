package session9.practica2;

public class Motocicleta extends Vehiculo {
  //Atributos
  private int cilindrada;
  private String tipo;

  //Constructor
  public Motocicleta(String marca, String modelo,int cilindrada, String tipo) {
    super(marca, modelo);
    this.cilindrada = cilindrada;
    this.tipo = tipo;
  }

  //Getters y Setters
  public int getCilindrada() {
    return cilindrada;
  }

  public void setCilindrada(int cilindrada) {
    this.cilindrada = cilindrada;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  //Metodo de comportamiento
  @Override
  public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Cilindrada: " + cilindrada + "\nTipo: " + tipo);
  }
}
