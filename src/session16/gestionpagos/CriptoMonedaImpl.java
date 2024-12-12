package session16.gestionpagos;

public class CriptoMonedaImpl implements MetodoPago{

  //Atributo
  private String direccionBilletera;

  //Constructor
  public CriptoMonedaImpl(String direccionBilletera) {
    this.direccionBilletera = direccionBilletera;
  }

  //Getters and Setters
  public String getDireccionBilletera() {
    return direccionBilletera;
  }

  public void setDireccionBilletera(String direccionBilletera) {
    this.direccionBilletera = direccionBilletera;
  }

  //Metodos de Interfaz.
  @Override
  public void procesarPago(double monto) {
    System.out.println("\nProcesando pago a traves de Criptomoneda $" + monto);
  }

  @Override
  public String obtenerDetallesPago() {
    return "Criptomoneda - Direccion de la billetera  " + direccionBilletera;
  }
}
