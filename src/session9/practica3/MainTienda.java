package session9.practica3;

public class MainTienda {
  public static void main(String[] args) {

    Producto producto = new Producto("Taza", 233);
    Electronico electronico = new Electronico("Laptop", 1500, "Macbook", 1);
    Alimento alimento = new Alimento("Arroz", 10, "10/12/24", "Perecedero");


    producto.mostrarInformacion();
    System.out.println("----------------------");
    electronico.mostrarInformacion();
    System.out.println("----------------------");
    alimento.mostrarInformacion();
  }
}
