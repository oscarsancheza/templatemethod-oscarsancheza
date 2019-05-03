package motorCombustible;

public class MotorEconomico implements MotorCombustible {

  @Override
  public void encender() {
    System.out.println("Motor Economico Encendido");
  }

  @Override
  public void acelerar() {
    System.out.println("Acelerando");
  }

  @Override
  public void apagar() {
    System.out.println("Apagando...");
  }
}
