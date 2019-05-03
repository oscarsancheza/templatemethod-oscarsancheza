package app;

import adapters.MotorElectricoAdapter;
import motorCombustible.MotorBasico;
import motorCombustible.MotorCombustible;
import motorCombustible.MotorEconomico;
import motorElectrico.MotorElectrico;
import motorElectrico.MotorElectricoBasico;

public class MainTestDrive {

  public static void main(String[] args) {
    MotorElectrico motorElectrico = new MotorElectricoBasico();
    MotorElectricoAdapter motorElectricoAdapter = new MotorElectricoAdapter(motorElectrico);
    motorElectricoAdapter.encender();
    motorElectricoAdapter.acelerar();
    motorElectricoAdapter.apagar();
    System.out.println();

    MotorCombustible motorCombustibleBasico = new MotorBasico();
    motorCombustibleBasico.encender();
    motorCombustibleBasico.acelerar();
    motorCombustibleBasico.apagar();
    System.out.println();

    MotorCombustible motorCombustibleEconomico = new MotorEconomico();
    motorCombustibleEconomico.encender();
    motorCombustibleEconomico.acelerar();
    motorCombustibleEconomico.apagar();
  }
}
