package session17.composicionejemplo1;

//Composicion tiene una relacion de "Tiene un o Usa un". Al contrario de la herencia que es: "Es un".
public class Vehiculo {

  private String marca;
  private Motor motor; //Composicion. Es hacer referencia a una clase(Motor)  desde los atributos de otra clase(Vehiculo).

  public Vehiculo(String marca, Motor motor) {
    this.marca = marca;
    this.motor = motor;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public Motor getMotor() {
    return motor;
  }

  public void setMotor(Motor motor) {
    this.motor = motor;
  }

  public void mostrarDetalles() {
    System.out.println("Marca del vehiculo: " + this.marca + " \nCaballos de fuerza: " + motor.getCaballosFuerza() + " HP");
  }
}
