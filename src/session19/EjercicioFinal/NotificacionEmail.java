package session19.EjercicioFinal;

public class NotificacionEmail implements Notificacion {

  private String direccionEmail;

  public NotificacionEmail(String direccionEmail) {
    this.direccionEmail = direccionEmail;
  }

  public String getDireccionEmail() {
    return direccionEmail;
  }

  public void setDireccionEmail(String direccionEmail) {
    this.direccionEmail = direccionEmail;
  }

  @Override
  public void enviar(String mensaje) {
    System.out.println("Mensaje enviado a traves de email: " + mensaje);
  }

  @Override
  public String obtenerDetallesNotificacion() {
    return "Notificacion Email - Direccion: " + this.direccionEmail;
  }
}
