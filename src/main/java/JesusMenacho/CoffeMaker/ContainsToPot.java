package CoffeMaker;

public class ContainsToPot {

    protected boolean isOnProcessing;
    protected boolean isComplete;
    protected boolean isEmpty;

    public ContainsToPot() {
        isEmpty = false;
        isOnProcessing = false;
        isComplete = false;
    }

    public void start() {
        isOnProcessing = true;
        isComplete = false;
    }

    public void done() {
        isOnProcessing = false;
        isComplete = true;
    }

    protected void ContainsIsEmpty() {

        isEmpty = true;
    }
    public boolean getStatusContais(){
        return isEmpty;
    }

    protected void ContainsIsNotEmpty() {

        isEmpty = false;
    }

    public boolean isReady() {
        if (isComplete) {
            return true;
        }
        return false;
    }
}
