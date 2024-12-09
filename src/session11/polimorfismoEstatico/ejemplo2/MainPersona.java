package session11.polimorfismoEstatico.ejemplo2;

public class MainPersona {
  public static void main(String[] args) {
    Persona persona1 = new Persona();
    Persona persona2 = new Persona("Leonardo");
    Persona persona3 = new Persona("Ana", 32);

    persona1.mostrarInformacion();
    persona2.mostrarInformacion();
    persona3.mostrarInformacion();
  }
}
