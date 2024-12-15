package session19.EjercicioFinal;

public class NotificacionPush implements Notificacion {

  private String tokenDispositivo;

  public NotificacionPush(String tokenDispositivo) {
    this.tokenDispositivo = tokenDispositivo;
  }

  public String getTokenDispositivo() {
    return tokenDispositivo;
  }

  public void setTokenDispositivo(String tokenDispositivo) {
    this.tokenDispositivo = tokenDispositivo;
  }

  @Override
  public void enviar(String mensaje) {
    System.out.println("Mensaje enviado a traves de una notificacion push: " + mensaje);
  }

  @Override
  public String obtenerDetallesNotificacion() {
    return "Notificacion push - Token: " + this.tokenDispositivo;
  }
}
