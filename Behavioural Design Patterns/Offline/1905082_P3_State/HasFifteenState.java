public class HasFifteenState implements State{
    VendingMachine gumballMachine;

    public HasFifteenState(VendingMachine gumballMachine) {
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
        System.out.println("Total money received: 15 taka");
        System.out.println("Money returned: 5 taka");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {

    }

    @Override
    public void refill() {

    }
}
