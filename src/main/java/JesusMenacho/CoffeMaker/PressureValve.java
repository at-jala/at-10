package CoffeMaker;

public class PressureValve {
    final int VALVE_ON = 1;
    //close is off
    final int VALVE_Off = 0;
    public int stateOfVale = 0;

    public int getReliefValveState() {
        if (VALVE_ON == stateOfVale) {
            return 1;
        }
        return 0;
    }

    public void setReliefValveState(int stateOfVale) {

        this.stateOfVale = stateOfVale;
    }
}
