package CoffeMaker;

public class PlateHeater implements Heater{
    final int PLATE_HEATER_ON = 1;
    final int PLATE_HEATER_OFF = 0;
    public int plateHeaterStatus = 0;
    @Override
    public int getStatusHeater() {
        if (PLATE_HEATER_ON==plateHeaterStatus){
            return 1;
        }
        return 0;
    }

    @Override
    public void setStatusheater(int StatusHeater) {
        this.plateHeaterStatus=StatusHeater;
    }
}
