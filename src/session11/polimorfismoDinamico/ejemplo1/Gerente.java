package session11.polimorfismoDinamico.ejemplo1;

public class Gerente extends Empleado {
  private String departamento;

  public Gerente(String nombre, int edad, String departamento) {
    super(nombre, edad);
    this.departamento = departamento;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  @Override
  public void mostrarInformacion() {
    System.out.println("Soy el gerente " + getNombre());
    System.out.println("Mi edad es " + getEdad());
    System.out.println("Y estoy a cargo del departamento: " + this.departamento + "\n");
  }
}
