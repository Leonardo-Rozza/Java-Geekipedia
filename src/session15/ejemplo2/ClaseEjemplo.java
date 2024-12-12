package session15.ejemplo2;

public class ClaseEjemplo implements InterfazA, InterfazB {

  @Override
  public void metodo(){
    InterfazA.super.metodo();
    InterfazB.super.metodo();
  }
}
