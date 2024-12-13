package session17.composicionejemplo2;

public class MainComputadora {
  public static void main(String[] args) {

    Procesador procesador = new Procesador("Intel i9");
    Memoria memoria = new Memoria(16);
    Computadora computadora = new Computadora(procesador, memoria);

    computadora.mostrarDetalles();
  }
}
