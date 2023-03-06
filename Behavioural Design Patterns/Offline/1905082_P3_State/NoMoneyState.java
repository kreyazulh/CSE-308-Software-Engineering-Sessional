public class NoMoneyState implements State {
    VendingMachine gumballMachine;

    public NoMoneyState(VendingMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertFive() {
        System.out.println("You inserted: 5 taka");
        gumballMachine.setState(gumballMachine.getHasFiveState());
    }

    @Override
    public void insertTen() {
        System.out.println("You inserted: 10 taka");
        gumballMachine.setState(gumballMachine.getHasTenState());
    }

    @Override
    public void insertTwenty() {
        System.out.println("You inserted: 20 taka");
        gumballMachine.setState(gumballMachine.getHasTwentyState());
    }

    public void ejectMoney() {
        System.out.println("No money pending");
    }

    public void turnCrank() {
        System.out.println("Machine is waiting for payment");
    }

    public void dispense() {

    }

    public void refill() { }

    public String toString() {
        return "waiting for new payment";
    }
}