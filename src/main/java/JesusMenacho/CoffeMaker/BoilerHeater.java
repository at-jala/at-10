package CoffeMaker;

public class BoilerHeater implements Heater {
    final int BOILER_HEATER_ON = 1;
    final int BOILER_HEATER_OFF = 0;
    public int boilerHeaterStatus = 0;

    @Override
    public int getStatusHeater() {
        if (BOILER_HEATER_ON == boilerHeaterStatus) {
            return 1;
        }
        return 0;
    }

    @Override
    public void setStatusheater(int statusHeater) {
        this.boilerHeaterStatus = statusHeater;
    }
}
