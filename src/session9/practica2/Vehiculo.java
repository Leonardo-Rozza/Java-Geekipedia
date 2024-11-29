package session9.practica2;

public class Vehiculo {
  //Atributos
  private String marca;
  private String modelo;

  //Constructor
  public Vehiculo(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }

  //Getters y Setters
  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  //Métódo de comportamiento
  public void mostrarInformacion(){
    System.out.println("Marca: " + marca + "\nModelo: " + modelo);
  }
}
