package CoffeMaker;

public class Boiler {
    final int BOILER_EMPTY = 0;
    final int BOILER_NOT_EMPTY = 1;
    final int BOILER_ON = 1;
    final int BOILER_OFF = 0;
    public int boilerStatus;
    public int boilerStatusContains = 0;

    public void setBoilerStatus(int boilerStatus) {
        this.boilerStatus = boilerStatus;
    }

    public int getBoilerStatus() {
        if (BOILER_ON == boilerStatus) {
            return 1;
        }
        return 0;
    }

    public void setBoilerStatusContains(int boilerStatusContains) {
        this.boilerStatusContains = boilerStatusContains;
    }

    public int getBoilerStatusContains() {
        if (BOILER_NOT_EMPTY == boilerStatusContains) {
            return 1;
        }
        return 0;
    }
}
