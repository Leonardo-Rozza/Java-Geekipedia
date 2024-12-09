package session11.polimorfismoDinamico.ejemplo2;

public class Vehiculo {
  //Atributos
  private String marca;


  //constructor
  public Vehiculo(String marca) {
    this.marca = marca;
  }

  //Getter and Setter
  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  //Metodo de comportamiento
  public void mover(){
    System.out.println("El vehiculo se está moviendo.");
  }

  public void mostrarInformacion(){
    System.out.println("Marca: " + marca + "\n");
  }


}
