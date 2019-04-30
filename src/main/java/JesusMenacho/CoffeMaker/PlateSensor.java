package CoffeMaker;

public class PlateSensor implements Sensor {
    final int WARMER_ON_STATUS = 1;
    final int WARMER_OFF_STATUS = 0;
    final int WARMER_EMPTY = 0;
    final int WARMER_NOT_EMPTY = 1;
    public int warmerStatus = 0;
    public int warmerStatusSensor = 0;

    public int getStatusSensorEmptyorNot() {
        if (WARMER_NOT_EMPTY == warmerStatusSensor) {
            return 1;
        }
        return 0;
    }

    public void setStatusSensorEmptyorNot(int warmerStatusSensor) {
        this.warmerStatusSensor = warmerStatusSensor;
    }

    @Override
    public int getStatusSensor() {
        if (WARMER_ON_STATUS == warmerStatusSensor) {
            return 1;
        }
        return 0;
    }

    @Override
    public void setStatusSensor(int statusSensor) {
        this.warmerStatusSensor = statusSensor;
    }
}
