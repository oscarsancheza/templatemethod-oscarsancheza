package app;

import adapters.MotorElectricoAdapter;
import motorCombustible.MotorComun;
import motorCombustible.MotorCombustible;
import motorCombustible.MotorEconomico;
import motorElectrico.MotorElectricoComun;

public class MainTestDrive {

  public static void main(String[] args) {
    MotorCombustible motorElectricoAdapter = new MotorElectricoAdapter(new MotorElectricoComun());
    motorElectricoAdapter.recorrido();
    System.out.println();

    MotorCombustible motorCombustibleBasico = new MotorComun();
    motorCombustibleBasico.recorrido();
    System.out.println();

    MotorCombustible motorCombustibleEconomico = new MotorEconomico();
    motorCombustibleEconomico.recorrido();
  }
}
