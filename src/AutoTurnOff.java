public class AutoTurnOff implements IState {

    private final Auto auto;

    public AutoTurnOff(Auto auto) {
        this.auto = auto;

    }

    public void on() {
        System.out.println("El auto esta encendido!");
        auto.setActualState(auto.getAutoStart());
    }

    public void drive() {
        System.out.println("El auto no se puede manejar si esta apagado");
    }

    public void off() {
        System.out.println("El auto ya esta apagado!");
    }
}
