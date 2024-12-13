package session17.composicionejemplo1;

public class MainVehiculo {
  public static void main(String[] args) {

    Motor motorVX3 = new Motor(300);
    Motor motorVX3Plus = new Motor(500);

    Vehiculo nissanSentra = new Vehiculo("Nissan", motorVX3);

    nissanSentra.mostrarDetalles();
  }
}
