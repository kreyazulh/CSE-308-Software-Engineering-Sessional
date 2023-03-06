public class HasFiveState implements State{
    VendingMachine gumballMachine;

    public HasFiveState(VendingMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertFive() {
        System.out.println("You inserted: 5 taka");
        gumballMachine.setState(gumballMachine.getHasTenState());
    }

    @Override
    public void insertTen() {
        System.out.println("You inserted: 10 taka");
        gumballMachine.setState(gumballMachine.getHasFifteenState());
    }

    @Override
    public void insertTwenty() {
        System.out.println("You inserted: 20 taka");
        gumballMachine.setState(gumballMachine.getHasTwentyfiveState());
    }

    @Override
    public void ejectMoney() {
        System.out.println("Money returned: 5 taka");
    }

    @Override
    public void turnCrank() {
        System.out.println("Money required more: 5 taka");
    }

    @Override
    public void dispense() {

    }

    @Override
    public void refill() {

    }
    public String toString() {
        return "waiting for the completion of current payment which requires 5 taka more";
    }
}
