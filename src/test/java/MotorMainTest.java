import adapters.MotorElectricoAdapter;
import motorCombustible.MotorComun;
import motorCombustible.MotorCombustible;
import motorCombustible.MotorEconomico;
import motorElectrico.MotorElectricoComun;
import org.junit.Before;
import org.junit.Test;

public class MotorMainTest {

  private MotorCombustible motorCombustible;

  @Before
  public void setup() {
  }

  @Test
  public void motorElectrico() {
    motorCombustible = new MotorElectricoAdapter(new MotorElectricoComun());
    motorCombustible.recorrido();
    System.out.println();
  }

  @Test
  public void motorComun() {
    motorCombustible = new MotorComun();
    motorCombustible.recorrido();
    System.out.println();
  }

  @Test
  public void motorEconomico() {
    motorCombustible = new MotorEconomico();
    motorCombustible.recorrido();
    System.out.println();
  }
}
