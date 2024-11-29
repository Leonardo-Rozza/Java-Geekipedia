package session7.ejemplo1;

public class MainContador {
  public static void main(String[] args) {
    Contador contador = new Contador();
    Contador contador2 = new Contador();
    Contador contador3 = new Contador();

    int totalInstancias = contador.getTotalInstancias();

    System.out.println(totalInstancias);
  }
}
