public class VendingMachine {

    State soldOutState;
    State noMoneyState;
    State soldState;
    State hasFiveState;
    State hasTenState;
    State hasFifteenState;
    State hasTwentyState;
    State hasTwentyfiveState;
    State state;
    int count = 0;

    public VendingMachine(int numberGums) {
        soldOutState = new SoldOutState(this);
        noMoneyState = new NoMoneyState(this);
        soldState = new SoldState(this);
        hasTenState = new HasTenState(this);
        hasFifteenState = new HasFifteenState(this);
        hasFiveState = new HasFiveState(this);
        hasTwentyState = new HasTwentyState(this);
        hasTwentyfiveState = new HasTwentyfiveState(this);

        this.count = numberGums;
        if (numberGums > 0) {
            state = noMoneyState;
        } else {
            state = soldOutState;
        }
    }


    public void insertFive() {
        state.insertFive();
    }

    public void insertTen() {
        state.insertTen();
    }

    public void insertTwenty() {
        state.insertTwenty();
    }

    public void ejectMoney() {
        state.ejectMoney();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseGum() {
        System.out.println("----PRODUCT RECEIVED----");
        if (count > 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    void refill(int count) {
        this.count += count;
        System.out.println("The machine was just refilled");
        System.out.println("Its new count is: " + this.count);
        state.refill();
    }

    void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }


    public State getHasFiveState() {
        return hasFiveState;
    }
    public State getHasTenState() {
        return hasTenState;
    }

    public State getHasTwentyState() {
        return hasTwentyState;
    }
    public State getHasFifteenState() {
        return hasFifteenState;
    }

    public State getHasTwentyfiveState() {
        return hasTwentyfiveState;
    }

    public State getSoldState() {
        return soldState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nZul Bubble Gum Machine");
        result.append("\nInventory: " + count + " item");
        if (count > 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}