import adapters.MotorElectricoAdapter;
import motorCombustible.MotorBasico;
import motorCombustible.MotorCombustible;
import motorCombustible.MotorEconomico;
import motorElectrico.MotorElectrico;
import motorElectrico.MotorElectricoBasico;
import org.junit.Before;
import org.junit.Test;

public class MotorMainTest {

  MotorElectrico motorElectrico;
  MotorCombustible motorCombustible;
  MotorElectricoAdapter motorElectricoAdapter;

  @Before
  public void setup() {
    motorElectrico = new MotorElectricoBasico();
  }

  @Test
  public void motorElectrico() {
    motorElectricoAdapter = new MotorElectricoAdapter(motorElectrico);
    motorElectricoAdapter.encender();
    motorElectricoAdapter.acelerar();
    motorElectricoAdapter.apagar();
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
