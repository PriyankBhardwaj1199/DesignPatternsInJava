import com.DesignPattern.Behavioral.State.VendingMachine;

public class StatePatternDemo {

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.insertCoin();
        machine.pressButton();


        machine.pressButton();
        machine.insertCoin();
        machine.insertCoin();
        machine.dispense();
    }
}
