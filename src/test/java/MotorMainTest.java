import adapters.MotorElectricoAdapter;
import motorCombustible.MotorBasico;
import motorCombustible.MotorCombustible;
import motorCombustible.MotorEconomico;
import motorElectrico.MotorElectrico;
import motorElectrico.MotorElectricoBasico;
import org.junit.Before;
import org.junit.Test;

public class MotorMainTest {

  MotorCombustible motorCombustible;

  @Before
  public void setup() {
  }

  @Test
  public void motorElectrico() {
    motorCombustible = new MotorElectricoAdapter(new MotorElectricoBasico());
    motorCombustible.encender();
    motorCombustible.acelerar();
    motorCombustible.apagar();
    System.out.println();
  }

  @Test
  public void motorBasico() {
    motorCombustible = new MotorBasico();
    motorCombustible.encender();
    motorCombustible.acelerar();
    motorCombustible.apagar();
    System.out.println();
  }

  @Test
  public void motorEconomico() {
    motorCombustible = new MotorEconomico();
    motorCombustible.encender();
    motorCombustible.acelerar();
    motorCombustible.apagar();
    System.out.println();
  }
}
