package motorCombustible;

public class MotorComun implements MotorCombustible {

  @Override
  public void encender() {
    System.out.println("Motor comun encendido");
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
