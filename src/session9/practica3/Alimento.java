package session9.practica3;

public class Alimento extends Producto {
  private String fechaCaducidad;
  private String tipo;

  public Alimento(String nombre, int precio, String fechaCaducidad, String tipo) {
    super(nombre, precio);
    this.fechaCaducidad = fechaCaducidad;
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getFechaCaducidad() {
    return fechaCaducidad;
  }

  public void setFechaCaducidad(String fechaCaducidad) {
    this.fechaCaducidad = fechaCaducidad;
  }

  @Override
  public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Fecha de caducidad: " + fechaCaducidad + "\nTipo: " + tipo);
  }
}
