package entities;

public class TecladoOperacion {

  private boolean onOff = Calculadora.estadoCalculadora();

  public boolean keyOnOff() {
    this.onOff = !onOff;
    return onOff;
  }

}
