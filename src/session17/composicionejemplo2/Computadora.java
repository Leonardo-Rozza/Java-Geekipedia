package session17.composicionejemplo2;

import org.w3c.dom.ls.LSOutput;

public class Computadora {

  private Procesador procesador;
  private Memoria memoria;

  public Computadora(Procesador procesador, Memoria memoria) {
    this.procesador = procesador;
    this.memoria = memoria;
  }

  public Procesador getProcesador() {
    return procesador;
  }

  public void setProcesador(Procesador procesador) {
    this.procesador = procesador;
  }

  public Memoria getMemoria() {
    return memoria;
  }

  public void setMemoria(Memoria memoria) {
    this.memoria = memoria;
  }

  public void mostrarDetalles(){
    System.out.println("Procesador:  " + this.procesador.getModelo() + "\nMemoria: " + this.memoria.getCapacidad() + " GB");
  }
}