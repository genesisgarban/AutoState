public class AutoOn implements IState {

    private final Auto auto;

    public AutoOn(Auto auto) {
        this.auto = auto;
    }

    public void on() {
        System.out.println("El auto esta encendido!");
    }

    public void drive() {
        System.out.println("El auto esta en movimiento!");
        auto.setActualState(auto.getAutoMovement());
    }

    public void off() {
        System.out.println("El auto esta apagado");
        auto.setActualState(auto.getAutoOff());
    }
}