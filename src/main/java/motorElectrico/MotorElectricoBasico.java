package motorElectrico;

public class MotorElectricoBasico implements MotorElectrico {
  @Override
  public void conectar() {
    System.out.println("Conectando motor Electrico");
  }

  @Override
  public void activar() {
    System.out.println("Activando");
  }

  @Override
  public void moverMasRapido() {
    System.out.println("moviendo rapido");
  }

  @Override
  public void detener() {
    System.out.println("detener");
  }

  @Override
  public void desconectar() {
    System.out.println("Desconectando");
  }
}
