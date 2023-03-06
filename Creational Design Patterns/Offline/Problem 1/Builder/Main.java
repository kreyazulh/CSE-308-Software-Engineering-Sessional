import builders.PCBuilder;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //input
        PCBuilder pcBuilder;
        while (true) {
            System.out.println("Enter 'O' to start your order & 'E' to end the order.");
            String input = sc.nextLine();
            if (input.equals("O")) {
                while (true) {
                    System.out.println("Select the type of pc you would like to order: ");
                    System.out.println("1. Gaming PC");
                    System.out.println("2. 11th Generation intel Core i5 Processor PC");
                    System.out.println("3. 11th Generation intel Core i7 Processor PC");
                    System.out.println("4. 11th Generation intel intel Core i9 Processor PC");
                    input = sc.nextLine();
                    if (input.equals("O") || input.equals("o")) {
                        System.out.println("Please enter 'O' to start your order");
                        input = sc.nextLine();
                        if (input.equals("E") || input.equals("e"))
                            continue;
                        else {
                            System.out.println("Invalid input"); //repeat the process
                            input = sc.nextLine();
                        }
                    }
                    String pc = input;
                    System.out.println("Will you like to add a RAM?");
                    System.out.println("Press Y or N");
                    input = sc.nextLine();

                    String ram;
                    if (input.equals("N") || input.equals("n"))
                        ram = null;
                    else {
                        System.out.println("Which RAM will you like to choose?");
                        System.out.println("1. 2666 MHz");
                        System.out.println("2. 3200 MHz");
                        System.out.println("3. None");
                        input = sc.nextLine();

                    }
                    ram = input;
                }
                System.out.println("Will you like to add a graphics card?");
                System.out.println("Press Y or N");
                input = sc.nextLine();
                if (input.equals("O")) {
                    System.out.println("Error. Do you want to finish your ongoing order? Press 'E'");
                    input = sc.nextLine();
                    if (input.equals("E")) {
                        break;
                    } else {
                        System.out.println("Enter the previous input again.");
                        input = sc.nextLine();
                    }
                }
                String graphicsCard;
                if (input.equals("N"))
                    graphicsCard = null;
                else {
                    System.out.println("Which graphics card will you like to choose?");
                    System.out.println("1. 2GB");
                    System.out.println("2. 4GB");
                    System.out.println("3. None");
                    input = sc.nextLine();

                }
                graphicsCard = input;
            }

            pcBuilder.getProduct();
            System.out.println("Do you want to continue ordering?");
            input = sc.nextLine();
            if (input.equals("N"))
                break;

            else
                continue;
        }
    }
}



