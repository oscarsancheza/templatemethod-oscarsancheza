package motorCombustible;

public abstract class MotorCombustible {

  public final void recorrido() {
    System.out.println("Inicio de recorrido...");
    encender();
    acelerar();
    apagar();
  }

  protected abstract void encender();

  protected abstract void acelerar();

  protected abstract void apagar();
}
