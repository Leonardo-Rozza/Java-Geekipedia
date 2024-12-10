package session12.ejemplo1;

public class MainAnimal {
  public static void main(String[] args) {

    Animal gato = new Gato();
    Animal perro = new Perro();

    gato.hacerSonido();
    gato.dormir();

    System.out.println();

    perro.hacerSonido();
    perro.dormir();
  }
}
