package session16.gestionpagos;

public class TarjetaCreditoImpl implements MetodoPago {

  //Atributos
  private String numeroTarjeta;

  private String nombreTitular;

  //Constructor
  public TarjetaCreditoImpl(String numeroTarjeta, String nombreTitular) {
    this.numeroTarjeta = numeroTarjeta;
    this.nombreTitular = nombreTitular;
  }

  //Getters and Setters
  public String getNumeroTarjeta() {
    return numeroTarjeta;
  }

  public void setNumeroTarjeta(String numeroTarjeta) {
    this.numeroTarjeta = numeroTarjeta;
  }

  public String getNombreTitular(){
    return nombreTitular;
  }

  public void setNombreTitular(String nombreTitular){
    this.nombreTitular = nombreTitular;
  }

  //Metodos de la interfaz
  @Override
  public void procesarPago(double monto) {
    System.out.println("\nProcesando Pago con tarjeta de credito de $" + monto + " para " + this.nombreTitular);
  }

  @Override
  public String obtenerDetallesPago() {
    return "Tarjeta de credito - Titular: " + this.nombreTitular + "\nNumero de Tarjeta: " + this.numeroTarjeta;
  }
}
