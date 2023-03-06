public class SoldOutState implements State {
    VendingMachine gumballMachine;

    public SoldOutState(VendingMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    

    @Override
    public void insertFive() {
        System.out.println("You inserted: 5 taka");
        System.out.println("Money returned: 5 taka");
    }

    @Override
    public void insertTen() {
        System.out.println("You inserted: 10 taka");
        System.out.println("Money returned: 10 taka");
    }

    @Override
    public void insertTwenty() {
        System.out.println("You inserted: 20 taka");
        System.out.println("Money returned: 20 taka");
    }

    public void ejectMoney() {

    }

    public void turnCrank() {
        System.out.println("Sorry! The inventory is empty. Try again later");
    }

    public void dispense() {

    }

    public void refill() {
        gumballMachine.setState(gumballMachine.getNoMoneyState());
    }

    public String toString() {
        return "sold out!";
    }

}
