package session14.operacionesmatematicas;

public class CalculaadoraImpl implements OperacionesMatematicas {

  @Override
  public int sumar(int a, int b) { //Firma del método.
    return a+b;                      //Implementacion del método.
  }

  @Override
  public int restar(int a, int b) {
    return a-b;
  }
}
