package session16.gestionpagos;

/**
 * Interfaz que define los métodos para procesar pagos.
 */
public interface MetodoPago {

  /**
   *Este metodo procesa los pagos.
   * @param monto
   */
  void procesarPago(double monto);

  /**
   * Obtiene y retorna los detalles del pago.
   * @return String
   */
  String obtenerDetallesPago();

}
