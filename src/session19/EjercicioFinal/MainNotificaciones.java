package session19.EjercicioFinal;

public class MainNotificaciones {
  public static void main(String[] args) {

    Notificacion notificacionSMS = new NotificacionSMS("1134569008");
    Notificacion notificacionEmail = new NotificacionEmail("leonardo@gmail.com");
    Notificacion notificacionPush = new NotificacionPush("267382LO43PQ13");

    ServicioNotificaciones servicioNotificaciones = new ServicioNotificaciones();

    servicioNotificaciones.enviar(notificacionSMS, "Buenas como estas?");
    servicioNotificaciones.enviar(notificacionEmail, "Buenas como estas?");
    servicioNotificaciones.enviar(notificacionPush, "Buenas como estas?");
  }
}
