public class Auto implements IState {
   private IState autoStart;
  private IState autoMovement;
   private IState autoOff;
   private IState  actualState;

    public Auto(){
        this.autoStart = new AutoOn(this);
        this.autoMovement = new AutoDrive(this);
        this.autoOff = new AutoTurnOff(this);

        this.actualState = this.autoStart;

    }
        public void on(){
        this.actualState.on();
        }

        public void drive(){
        this.actualState.drive();

        }

        public void off() {
        this.actualState.off();
        }

    public IState getAutoStart() {
        return autoStart;
    }

    public void setAutoStart(IState autoStart) {
        this.autoStart = autoStart;
    }

    public IState getAutoMovement() {
        return autoMovement;
    }

    public void setAutoMovement(IState autoMovement) {
        this.autoMovement = autoMovement;
    }

    public IState getAutoOff() {
        return autoOff;
    }

    public void setAutoOff(IState autoOff) {
        this.autoOff = autoOff;
    }

    public IState getActualState() {
        return actualState;
    }

    public void setActualState(IState actualState) {
        this.actualState = actualState;
    }
}
