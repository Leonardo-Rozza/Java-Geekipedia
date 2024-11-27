package session7.ejemplo1;

public class MainContador {
  public static void main(String[] args) {
    Contador contador = new Contador();

    int totalInstancias = Contador.getTotalInstancias();

    System.out.println(totalInstancias);
  }
}
