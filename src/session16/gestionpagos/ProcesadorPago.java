package session16.gestionpagos;

public class ProcesadorPago {

  public void procesarPago(MetodoPago metodoPago,double monto) {
    metodoPago.procesarPago(monto);
    System.out.println("Detalles del pago: " + metodoPago.obtenerDetallesPago());
  }
}
