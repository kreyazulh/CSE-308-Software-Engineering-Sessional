public class HasTwentyState implements State{
    VendingMachine gumballMachine;

    public HasTwentyState(VendingMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertFive() {

    }

    @Override
    public void insertTen() {

    }

    @Override
    public void insertTwenty() {

    }

    @Override
    public void ejectMoney() {

    }

    @Override
    public void turnCrank() {
        System.out.println("Total money received: 20 taka");
        System.out.println("Money returned: 10 taka");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {

    }

    @Override
    public void refill() {

    }
}
