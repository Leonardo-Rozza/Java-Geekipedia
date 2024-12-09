package session11.polimorfismoDinamico.ejemplo1;

public class MainEmpresa {
  public static void main(String[] args) {

    //El polimorfismo dinamico se logra mediante la sobreescritura de métodos en tiempo de ejecucion.

    Empleado empleado1 = new Desarrollador("Carlos", 29, "Java");
    Empleado empleado2 = new Gerente("Pedro", 42, "RH");


  }
}
