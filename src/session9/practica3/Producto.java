package session9.practica3;

public class Producto {
  //Atributos
  private String nombre;
  private double precio;

  //Constructor
  public Producto(String nombre, double precio) {
    this.nombre = nombre;
    this.precio = precio;
  }

  //Getters y Setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  //Metodo de comportamiento
  public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre + "\nPrecio: " + precio);
  }
}
