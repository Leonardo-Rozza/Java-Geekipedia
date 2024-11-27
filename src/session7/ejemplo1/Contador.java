package session7.ejemplo1;

public class Contador {
  //En esta clase vemos los métodos y atributos estáticos.

  //Atributo
  private static int totalInstancias;

  //Constructor
  public Contador() {
    totalInstancias++;
  }

  //Metodo de clase
  public static int getTotalInstancias() {
    return totalInstancias;
  }
}
