package session16.gestionpagos;

public class PayPalImpl implements MetodoPago {

  //Atributos
  private String email;

  private String contrasenia;

  //Constructor
  public PayPalImpl(String email, String contrasenia) {
    this.email = email;
    this.contrasenia = contrasenia;
  }

  //Getters and Setters
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getContrasenia() {
    return contrasenia;
  }

  public void setContrasenia(String contrasenia) {
    this.contrasenia = contrasenia;
  }


  //Metodos de la interfaz.
  @Override
  public void procesarPago(double monto) {
    System.out.println("\nProcesando Pago a traves de PayPal $" + monto + " para " + this.email);
  }

  @Override
  public String obtenerDetallesPago() {
    return "PayPal - Email: " + this.email;
  }
}
