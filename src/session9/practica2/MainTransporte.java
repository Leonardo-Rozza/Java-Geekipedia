package session9.practica2;

public class MainTransporte {
  public static void main(String[] args) {

    Vehiculo vehiculo = new Vehiculo("Ford", "2020");
    Automovil automovil = new Automovil("Audi", "2000", 4, "Nafta");
    Motocicleta motocicleta = new Motocicleta("Yamaha", "2024", 200, "Deportiva");


    vehiculo.mostrarInformacion();
    System.out.println("---------------");
    automovil.mostrarInformacion();
    System.out.println("---------------");
    motocicleta.mostrarInformacion();
  }
}
