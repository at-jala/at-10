package CoffeMaker;

public class Light {
    final int INDICATOR_ON = 1;
    final int INDICATOR_OFF = 0;
    public int statusIndicator = 0;

    public void setStatusIndicator(int statusIndicator) {
        this.statusIndicator = statusIndicator;
    }

    public void set_StatusIndicador_on_Or_Off(int statusIndicator) {
        this.statusIndicator = statusIndicator;


    }

    public int getStatusIndicator() {

        if (INDICATOR_ON == statusIndicator) {
            return 1;
        }
        return 0;
    }
}
