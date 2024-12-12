package session15.gestiondispositivos;

public class TelefonoInteligenteImpl implements DispositivoInteligente, Portatil{

  //Atributos
  private String marca;
  private String modelo;

  //Constructor
  public TelefonoInteligenteImpl(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }

  //Getter y Setter
  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  //Implementacion de los metodos abstractos de las interfazes.
  @Override
  public void conectarInternet() {
    System.out.println( this.marca + " " + this.modelo + " conectado a Internet");
  }

  @Override
  public void desconectarInternet() {
    System.out.println( this.marca + " " + this.modelo + " desconectado de Internet");
  }

  @Override
  public void encender() {
    System.out.println( this.marca + " " + this.modelo + " está encendido");
  }

  @Override
  public void apagar() {
    System.out.println( this.marca + " " + this.modelo + " está apagado");
  }

  //Metodo de comportamiento
  public void actualizarBateria() {
    System.out.println( this.marca + " " + this.modelo + " bateria cargada al 100%");
  }
}
