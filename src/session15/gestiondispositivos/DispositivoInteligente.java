package session15.gestiondispositivos;

public interface DispositivoInteligente {

  void conectarInternet();

  void desconectarInternet();

  default void actualizarSoftware(){
    System.out.println("Actualizando Software");
  }

}
