package session19.EjercicioFinal;

public class NotificacionSMS implements Notificacion {

  private String numeroTelefono;

  public NotificacionSMS(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
  }

  public String getNumeroTelefono() {
    return numeroTelefono;
  }

  public void setNumeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
  }

  @Override
  public void enviar(String mensaje) {
    System.out.println("Mensaje enviado a traves de SMS: " + mensaje);
  }

  @Override
  public String obtenerDetallesNotificacion() {
    return "Notificacion SMS - numero de telefono: " + this.numeroTelefono;
  }
}
