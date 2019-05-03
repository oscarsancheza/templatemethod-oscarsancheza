package motorElectrico;

public class MotorElectricoComun implements MotorElectrico {
  @Override
  public void conectar() {
    System.out.println("Motor electrico comun conectado");
  }

  @Override
  public void activar() {
    System.out.println("Activando");
  }

  @Override
  public void moverMasRapido() {
    System.out.println("Moviendo rapido");
  }

  @Override
  public void detener() {
    System.out.println("Detener");
  }

  @Override
  public void desconectar() {
    System.out.println("Desconectando");
  }
}
