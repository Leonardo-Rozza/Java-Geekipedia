package session6.ejercicio1;

public class MainCuentaBancaria {
  public static void main(String[] args) {

    CuentaBancaria cuentaBancaria = new CuentaBancaria(100000);
    System.out.println("Saldo actual ARS: " + cuentaBancaria.consultaSaldo());
    System.out.println("Saldo en dolares: " + cuentaBancaria.consultaSaldo("USD"));
    System.out.println("Saldo en euros " + cuentaBancaria.consultaSaldo("eur"));
  }
}
