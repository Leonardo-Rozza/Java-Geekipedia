package session12.ejemplo2;

public class EmpleadoTiempoCompleto extends Empleado {

  //Atributos
  private double salarioMensual;

  //Constructor
  public EmpleadoTiempoCompleto(String nombre, double salarioMensual) {
    super(nombre);
    this.salarioMensual = salarioMensual;
  }

  //Implementacion del metodo abstracto
  @Override
  public double calcularSalario() {
    return this.salarioMensual;
  }


}
