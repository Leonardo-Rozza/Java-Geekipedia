package sesion5.ejercicio1;

public class Producto {

  // Atributos
  private String nombre;
  private int stock;
  private double precio;

  //Constructor
  public Producto(String nombre, int stock, double precio) {
    this.nombre = nombre;
    this.stock = stock;
    this.precio = precio;
  }

  //Delegacion de constructores.
  public Producto(String nombre, int stock) {
    this(nombre, stock, 0); //Enviamos los valores por defecto al constructor principal.
  }

  public Producto(String nombre) {
    //Mandamos a llamar al constructor 'padre' para que rellene los datos.
    this(nombre, 10, 0);
  }

  // Getters y Setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }
//Metodos de comportamientos

  public void mostrarInformacion(){
    System.out.println("Producto: " + nombre + "\n" + "Stock: " + stock + "\n" + "Precio: " + precio);
  }
}
