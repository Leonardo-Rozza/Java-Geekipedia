package session15.gestiondispositivos;

public class MainDispositivos {
  public static void main(String[] args) {
    TelefonoInteligenteImpl telefonoInteligente = new TelefonoInteligenteImpl("Iphone", "16");

    //Implementacion de métodos.
    telefonoInteligente.encender();
    telefonoInteligente.conectarInternet();
    telefonoInteligente.actualizarSoftware();
    telefonoInteligente.cargar();
    telefonoInteligente.desconectarInternet();
    telefonoInteligente.apagar();

    //Métedo concreto de la clase.
    telefonoInteligente.actualizarBateria();
  }
}
