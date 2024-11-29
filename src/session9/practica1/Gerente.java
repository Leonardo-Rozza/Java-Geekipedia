package session9.practica1;

public class Gerente extends Empleado {
  //Atributos
  private String departamento;
  private double bono;

  //Constructor
  public Gerente(String nombre,int edad, String departamento, double bono) {
    super(nombre, edad);
    this.departamento = departamento;
    this.bono = bono;
  }

  //Getters y Setters
  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public double getBono() {
    return bono;
  }

  public void setBono(double bono) {
    this.bono = bono;
  }

  //Métódo de comportamiento
  @Override
  public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Departamento: " + departamento + "\nBono: " + bono );
  }
}
