package session19.EjercicioFinal;

public class ServicioNotificaciones {

  public void enviar(Notificacion notificacion, String mensaje) {
    notificacion.enviar(mensaje);
    System.out.println("Detalles del mensaje: " + notificacion.obtenerDetallesNotificacion() + "\n");
  }
}
