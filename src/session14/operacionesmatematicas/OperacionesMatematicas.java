package session14.operacionesmatematicas;

public interface OperacionesMatematicas {

  int sumar(int a, int b);

  int restar(int a, int b);

  default int multiplicar(int a, int b) {
    return a * b;
  }

  static int dividir(int a, int b) {
    if (a == 0 || b == 0) {
      throw new Error("Error en el dividir por 0");
    }
    return a / b;
  }
}
