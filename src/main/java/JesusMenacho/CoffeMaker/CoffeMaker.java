package CoffeMaker;

public class CoffeMaker {
    public boolean makecoffe(int button, boolean pot,int whaterBoiler) {
        if (button!=1){
            return false;
        }
        Button btn = new Button();
        btn.setBrewButtonStatus(1);
        Light lightVar = new Light();
        lightVar.setStatusIndicator(1);
        ContainsToPot containsToPot = new ContainsToPot();
        if (pot) {
            containsToPot.ContainsIsNotEmpty();
        }
        else
        {
            containsToPot.ContainsIsEmpty();
        }
        WarmerPlate warmerPlate = new WarmerPlate();
        warmerPlate.setStatusWarmer(1);
        PressureValve pressureValve =new PressureValve();
        pressureValve.setReliefValveState(1);
        Boiler boiler=new Boiler();
        boiler.setBoilerStatusContains(whaterBoiler);
        BoilerSensor  boilerSensor = new BoilerSensor();
        boilerSensor.setStatusSensor(1);
        BoilerHeater boilerHeater=new BoilerHeater();
        boilerHeater.setStatusheater(1);
        PlateSensor plateSensor=new PlateSensor();
        plateSensor.setStatusSensorEmptyorNot(1);
        PlateHeater plateHeater=new PlateHeater();
        plateHeater.setStatusheater(1);
        if (!(containsToPot.getStatusContais()&& boiler.getBoilerStatus()==1)){
            return true;
        }
        return false;
    }
}
