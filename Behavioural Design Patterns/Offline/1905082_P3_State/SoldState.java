public class SoldState implements State {

    VendingMachine gumballMachine;

    public SoldState(VendingMachine gumballMachine) {
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

    public void ejectMoney() {
        System.out.println("Sorry, you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    public void dispense() {
        gumballMachine.releaseGum();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoMoneyState());
        } else {
            System.out.println("Out of products!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    public void refill() { }

    public String toString() {
        return "dispensing a gumball";
    }
}
