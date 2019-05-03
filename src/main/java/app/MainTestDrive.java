package app;

import adapters.MotorElectricoAdapter;
import motorCombustible.MotorComun;
import motorCombustible.MotorCombustible;
import motorCombustible.MotorEconomico;
import motorElectrico.MotorElectricoBasico;

public class MainTestDrive {

  public static void main(String[] args) {
    MotorCombustible motorElectricoAdapter = new MotorElectricoAdapter(new MotorElectricoBasico());
    motorElectricoAdapter.encender();
    motorElectricoAdapter.acelerar();
    motorElectricoAdapter.apagar();
    System.out.println();

    MotorCombustible motorCombustibleBasico = new MotorComun();
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
