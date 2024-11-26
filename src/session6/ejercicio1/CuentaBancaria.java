package session6.ejercicio1;

public class CuentaBancaria {
  //Atributo
  private double saldo;

  //Constructor
  public CuentaBancaria(double saldo) {
    this.saldo = saldo;
  }

 //Getters y Setters

  //Métodos de comportamientos
  public double consultaSaldo(){
    return saldo;
  }

  public double consultaSaldo(String moneda){
    /*
    if (moneda.equalsIgnoreCase("EUR")) saldo = saldo * 1300;
    if (moneda.equalsIgnoreCase("USD")) saldo = saldo * 1400;
    return saldo;
    */
    switch (moneda.toUpperCase()){
        case "EUR":
          return this.saldo / 1200;
        case "USD":
          return this.saldo / 1100;
        default:
          System.out.println("Moneda no soportada");
          return 0;
    }

  }
}
