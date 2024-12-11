package session14.operacionesmatematicas;

public interface OperacionesMatematicas {

  int sumar(int a, int b);

  int restar(int a, int b);

  default int multiplicar(int a, int b) {
    return a * b;
  }

  static int dividir(int a, int b) {

    //La intencion de las excepciones verificadas es que podamos colocar un mensaje personalizado para cuando caiga el programa.
    if (b == 0) {
      throw new ArithmeticException("No se puede dividir entre 0");
    }
    return a / b;



    //Excepciones No verificadas.
    //    try {
    //    return a / b;
    //    } catch (ArithmeticException e) {
    //      System.err.println("No se puede dividir entre 0");
    //    }
    //    return 0;


  }
}
