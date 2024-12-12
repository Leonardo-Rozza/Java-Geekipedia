package session15.gestiondispositivos;

public interface Portatil {

  void encender();

  void apagar();

  default void cargar(){
    System.out.println("Cargando...");
  }


}
