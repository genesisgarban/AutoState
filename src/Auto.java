public class Auto implements IState {
    private final IState autoStart;
    private final IState autoMovement;
    private final IState autoOff;
    private IState actualState;

    public Auto() {
        this.autoStart = new AutoOn(this);
        this.autoMovement = new AutoDrive(this);
        this.autoOff = new AutoTurnOff(this);

        this.actualState = this.autoStart;

    }

    public void on() {
        this.actualState.on();
    }

    public void drive() {
        this.actualState.drive();

    }

    public void off() {
        this.actualState.off();
    }

    IState getAutoStart() {
        return autoStart;
    }

    IState getAutoMovement() {
        return autoMovement;
    }

    IState getAutoOff() {
        return autoOff;
    }


    public void setActualState(IState actualState) {
        this.actualState = actualState;
    }
}
