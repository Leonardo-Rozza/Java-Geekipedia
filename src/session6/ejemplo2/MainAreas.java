package session6.ejemplo2;

public class MainAreas {
  public static void main(String[] args) {
    CalculadoraDeAreas areas = new CalculadoraDeAreas();

    System.out.println("Area de un cuadrado: " + areas.calcularArea(4));
    System.out.println("Area de un rectangulo: " + areas.calcularArea(4,6));
  }
}
