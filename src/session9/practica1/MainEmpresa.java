package session9.practica1;

public class MainEmpresa {
  public static void main(String[] args) {

    Empleado empleado = new Empleado("Luis Pérez", 30);
    Gerente gerente = new Gerente("María Gómez", 40, "Ventas", 20000);
    Desarrollador desarrollador = new Desarrollador("Carlos Ramírez", 28, "Java", 5);


    System.out.println("=== Información de Empleado ===");
    empleado.mostrarInformacion();

    System.out.println("\n=== Información de Gerente ===");
    gerente.mostrarInformacion();

    System.out.println("\n=== Información de Desarrollador ===");
    desarrollador.mostrarInformacion();
  }
}
