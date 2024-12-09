package session11.polimorfismoDinamico.ejemplo2;

import org.w3c.dom.ls.LSOutput;

public class Motocicleta extends Vehiculo {
  private boolean tieneTopCase;

  public Motocicleta(String marca, boolean tieneTopCase) {
    super(marca);
    this.tieneTopCase = tieneTopCase;
  }

  public boolean isTieneTopCase() {
    return tieneTopCase;
  }

  public void setTieneTopCase(boolean tieneTopCase) {
    this.tieneTopCase = tieneTopCase;
  }

  @Override
  public void mover(){
    System.out.println("La motocicleta se está moviendo sobre 2 ruedas");
  }

  @Override
  public void mostrarInformacion(){
    super.mostrarInformacion();
    System.out.println("Tiene porta equipaje?: " + (tieneTopCase ? "Si" : "No"));
  }
}
