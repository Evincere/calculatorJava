package entities;

public class Calculadora {

  private static String modelo;
  private static String nombre;
  private Pantalla pantalla;
  private Teclado teclado;
  private static boolean isOn;

  public Calculadora(String modelo, String nombre) {
    this.setModelo(modelo);
    this.setNombre(nombre);
    this.pantalla = new Pantalla();
    this.teclado = new Teclado();
    isOn = false;
  }

  public boolean onOffCalculadora() {
    isOn = teclado.onCalculadora();
    pantalla.setOn(true);
    return estadoCalculadora();
  }
  public static boolean estadoCalculadora(){
    return isOn;
  }
  public static String getModelo() {
    return modelo;
  }

  private void setModelo(String modelo) {
    modelo = modelo;
  }

  public static String getNombre() {
    return nombre;
  }

  private void setNombre(String nombre) {
    nombre = nombre;
  }

  private boolean isOn() {
    return isOn;
  }

  private void setOn(boolean on) {
    isOn = on;
  }
}
