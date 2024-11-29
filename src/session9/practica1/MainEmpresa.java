package session9.practica1;

public class MainEmpresa {
  public static void main(String[] args) {
    Empleado empleado = new Empleado("Fernando", 24);
    Gerente gerente = new Gerente("Luis", 34, "Logistica", 6000);
    Desarrollador desarrollador = new Desarrollador("Iván", 28, "Java", 2);

    empleado.mostrarInformacion();
    gerente.mostrarInformacion();
    desarrollador.mostrarInformacion();


  }
}
