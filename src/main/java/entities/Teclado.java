package entities;

public class Teclado {

  private final TecladoNumerico numero;
  private final TecladoOperacion operacion;

  public Teclado() {
    this.numero = new TecladoNumerico();
    this.operacion = new TecladoOperacion();
  }

  public boolean onCalculadora() {
    return operacion.keyOnOff();
  }
}
