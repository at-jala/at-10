package CoffeMaker;

public class BoilerSensor implements Sensor {
    final int BOILER_SENSOR_ON = 1;
    final int BOILER_SENSOR_OFF = 0;
    public int boilerStatusSensor = 0;

    @Override
    public int getStatusSensor() {
        if (BOILER_SENSOR_ON == boilerStatusSensor) {
            return 1;
        } else
            return 0;
    }

    @Override
    public void setStatusSensor(int statusSensor) {
        this.boilerStatusSensor = statusSensor;
    }
}
