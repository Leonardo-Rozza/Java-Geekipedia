package session14.operacionesmatematicas;

public class MainCalculadora {
  public static void main(String[] args) {

    OperacionesMatematicas calculadora = new CalculaadoraImpl();

    System.out.println(calculadora.multiplicar(2,3));
    System.out.println(calculadora.sumar(2,3));
    System.out.println(calculadora.restar(2,3));
    System.out.println(OperacionesMatematicas.dividir(10,2));


  }
}
