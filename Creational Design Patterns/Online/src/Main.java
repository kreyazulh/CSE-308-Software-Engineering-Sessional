import Builders.ShakeBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shake_Factory shake_factory = new Shake_Factory();
        ShakeBuilder shakeBuilder;
        boolean flag= false;

        while(true) {
            System.out.println("Enter 'O' to place an order & 'E' to end the order.");
            String input = sc.nextLine();
            if (input.equals("O")) {
                while (true) {
                    System.out.println("Which shake will you like to order?");
                    System.out.println("1. Chocolate Shake");
                    System.out.println("2. Coffee_Shake");
                    System.out.println("3. Zero_Shake");
                    input = sc.nextLine();
                }
            }
            String shake = input;
            System.out.println("Will you like to add a almond milk?");
            System.out.println("Press Y or N");
            input = sc.nextLine();
        }

    }
}
