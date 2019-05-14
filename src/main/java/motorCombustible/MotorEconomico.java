package motorCombustible;

public class MotorEconomico extends MotorCombustible {

  @Override
  public void encender() {
    System.out.println("Motor economico encendido");
  }

  @Override
  public void acelerar() {
    System.out.println("Acelerando...");
  }

  @Override
  public void apagar() {
    System.out.println("Apagando...");
  }
}
