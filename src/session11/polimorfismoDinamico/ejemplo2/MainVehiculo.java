package session11.polimorfismoDinamico.ejemplo2;

public class MainVehiculo {
  public static void main(String[] args) {
    Vehiculo coche = new Coche("Ford", 4);
    Vehiculo motocicleta = new Motocicleta("Yamaha", true);
    Vehiculo camion = new Camion("Volvo", 12);

    //Uso del polimorfismo.
    coche.mover();
    coche.mostrarInformacion();

    motocicleta.mover();
    motocicleta.mostrarInformacion();

    camion.mover();
    camion.mostrarInformacion();
  }
}
