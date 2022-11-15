package entities;

public class Operacion {

  private Suma suma;
  private Resta resta;
  private Multiplicacion multiplicacion;
  private Division division;
  private String resultado;


  public String sumar(int a, int b){
    return String.valueOf(Suma.execute(a,b));
  }

  public Suma getSuma() {
    return suma;
  }

  public void setSuma(Suma suma) {
    this.suma = suma;
  }

  public Resta getResta() {
    return resta;
  }

  public void setResta(Resta resta) {
    this.resta = resta;
  }

  public Multiplicacion getMultiplicacion() {
    return multiplicacion;
  }

  public void setMultiplicacion(Multiplicacion multiplicacion) {
    this.multiplicacion = multiplicacion;
  }

  public Division getDivision() {
    return division;
  }

  public void setDivision(Division division) {
    this.division = division;
  }

  public String getResultado() {
    return resultado;
  }

  public void setResultado(String resultado) {
    this.resultado = resultado;
  }
}
