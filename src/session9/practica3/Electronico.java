package session9.practica3;

public class Electronico extends Producto {
  private String marca;
  private int garantia;

  public Electronico(String nombre, int precio, String marca, int garantia) {
    super(nombre, precio);
    this.marca = marca;
    this.garantia = garantia;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getGarantia() {
    return garantia;
  }

  public void setGarantia(int garantia) {
    this.garantia = garantia;
  }

  @Override
  public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Marca: " + marca + "\nGarantia: " + garantia);
  }
}
