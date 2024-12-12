package session16.gestionpagos;

public class MainGestionPagos {
  public static void main(String[] args) {

    MetodoPago tarjetaCredito = new TarjetaCreditoImpl("1637-2809-3672-6389", "Alberto Flores");
    MetodoPago payPal = new PayPalImpl("alberto@gmail.com", "LosTroncos134N");
    MetodoPago criptoMoneda = new CriptoMonedaImpl("32423F3IJNFNO2N31NN1M444.Ñ1");

    ProcesadorPago procesadorPago = new ProcesadorPago();


    procesadorPago.procesarPago(tarjetaCredito, 2000);
    procesadorPago.procesarPago(payPal, 2500);
    procesadorPago.procesarPago(criptoMoneda, 3000);

  }
}
