package CoffeMaker;

public class WarmerPlate {
    final int WARMER_ON = 1;
    final int WARMER_OFF = 0;

    public int statusWarmer = 0;

    public void setStatusWarmer(int statusWarmer) {

        this.statusWarmer = statusWarmer;
    }

    public int getStatusWarmer() {
        if (WARMER_ON == statusWarmer) {
            return 1;
        }
        return 0;
    }
}
