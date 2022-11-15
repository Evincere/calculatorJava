package entities;

public class Pantalla {

  private int size;
  private String contenido;
  private boolean isOn;

  public Pantalla() {
    this.size = 10;
    this.contenido = null;
    this.isOn = false;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public String getContenido() {
    return contenido;
  }

  public void setContenido(String contenido) {
    this.contenido = contenido;
  }

  public boolean isOn() {
    return isOn;
  }

  public void setOn(boolean on) {
    isOn = on;
  }
}
