package session12.ejemplo2;

public class EmpleadoMedioTiempo extends Empleado {
  //Atributos
  private double tarifaPorHora;
  private int horasTrabajadas;

  //constructor
  public EmpleadoMedioTiempo(String nombre, double tarifaPorHora, int horasTrabajadas) {
    super(nombre);
    this.tarifaPorHora = tarifaPorHora;
    this.horasTrabajadas = horasTrabajadas;
  }

  //Implementacion del metodo abstracto.
  @Override
  public double calcularSalario() {
    return this.tarifaPorHora * this.horasTrabajadas;
  }

}
