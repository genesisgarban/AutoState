public class AutoDrive implements IState {

    private final Auto auto;

    public AutoDrive(Auto auto) {
        this.auto = auto;
    }

    public void on() {
        System.out.println("El auto ya esta encendido!");

    }

    public void drive() {
        System.out.println("El auto ya esta en movimiento");
    }

    public void off() {
        System.out.println("El auto esta apagado!");
        auto.setActualState(auto.getAutoOff());
    }
}

