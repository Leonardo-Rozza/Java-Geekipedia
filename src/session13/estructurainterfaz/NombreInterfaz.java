package session13.estructurainterfaz;

public interface NombreInterfaz {

  //Todos los atributos en las interfazes son publicos, constantes y estaticos.
  //Tambien es una mala practica.
  public final static int NUMERO_MAXIMO = 50;

  //Todos los metodos que se coloquen dentro de una interfaz, por defecto van a ser publicos y abstractos.
  void mostrarInformacion();


  //Para poder inicializar un metodo dentro de una Interfaz, el mismo tiene que ser estático.
  //Aunque no es una buena practica.
  static void metodoEstatico(){
    System.out.println("Este es un método estatico.");
  }

  //Metodos por default (con implementacion determinada)
  default double metodoDefault(){
    System.out.println("Lalalala");
    return 0.0;
  }
}
