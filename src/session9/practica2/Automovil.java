package session9.practica2;

public class Automovil extends Vehiculo {
  //Métodos
  private int puertas;
  private String combustible;

  //Constructor
  public Automovil(String marca, String modelo, int puertas, String combustible) {
    super(marca, modelo);
    this.puertas = puertas;
    this.combustible = combustible;
  }

  //Getters y Setters
  public int getPuertas() {
    return puertas;
  }

  public void setPuertas(int puertas) {
    this.puertas = puertas;
  }

  public String getCombustible() {
    return combustible;
  }

  public void setCombustible(String combustible) {
    this.combustible = combustible;
  }

  //Métódo de Comportamiento
  @Override
  public  void  mostrarInformacion(){
    super.mostrarInformacion();
    System.out.println("Puertas: " + puertas + "\nCombustible: " + combustible);
  }
}
