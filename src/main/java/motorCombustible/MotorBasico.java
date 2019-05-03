package motorCombustible;

public class MotorBasico implements MotorCombustible {

  @Override
  public void encender() {
    System.out.println("Motor Basico Encendido");
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
