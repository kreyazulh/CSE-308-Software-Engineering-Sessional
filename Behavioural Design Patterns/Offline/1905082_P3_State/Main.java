//This machine has one type of item worth 10 taka. Currency the machine can receive is 5 taka, 10 taka, 20 taka
//We created the states by available combination of money the product can receive, initially at NoMoneyState

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        VendingMachine gumballMachine = new VendingMachine(3);
        Scanner sc = new Scanner(System.in);
        System.out.println(gumballMachine);

        while (true) {
            System.out.println("Product worth is 10 taka. Select your currency value: ");
            System.out.println("1. 5 taka");
            System.out.println("2. 10 taka");
            System.out.println("3. 20 taka");
            System.out.println("4. Request Refill");
            System.out.println("5. No more bubble gum today");
            String input = sc.nextLine();

            if (input.equals("1")) {
                gumballMachine.insertFive();
                gumballMachine.turnCrank();

            }


            if (input.equals("2")) {
                gumballMachine.insertTen();
                gumballMachine.turnCrank();


            }
            if (input.equals("3")) {
                gumballMachine.insertTwenty();
                gumballMachine.turnCrank();


            }
            else if (input.equals("4")) {
                gumballMachine.refill(2);
            }

            else if (input.equals("5")) {
                gumballMachine.ejectMoney();
                System.out.println("\nCome back again later!");
                break;


            }
            System.out.println(gumballMachine);


        }
    }
}