package session12.ejemplo2;

public class MainEmpleado {
  public static void main(String[] args) {
    Empleado empleadoTiempoCompleto = new EmpleadoTiempoCompleto("Nicolas", 2900);
    Empleado empleado2 = new EmpleadoMedioTiempo("Ana", 20, 80);


    System.out.println(empleadoTiempoCompleto.getNombre());

    System.out.println(empleado2.calcularSalario());
  }
}
