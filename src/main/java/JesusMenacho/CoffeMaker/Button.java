package CoffeMaker;

public class Button {

    final int BREW_BUTTON_PUSHED = 1;
    final int BREW_BUTTON_NOT_PUSHED = 0;
    public int stateButton = 0;

    public void setBrewButtonStatus(int stateButton) {
        this.stateButton = stateButton;
    }

    public boolean getBrewButtonStatus() {
        if (BREW_BUTTON_PUSHED == stateButton) {
            return true;
        }
        return false;
    }
}
