import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer ACount=0, ECount=0, CCount=0, MCount=0;
        Integer At=0, Et=0, Ct=0, Mt=0;
        Integer Bill = ACount*160+ECount*170+CCount*230+MCount*240;
        System.out.println("---Welcome to Coffee Shop!---");

        while(true){

            System.out.println("\nOrder your desired coffee: ");
            System.out.println("1. Americano");
            System.out.println("2. Expresso");
            System.out.println("3. Cappuccino");
            System.out.println("4. Mocha");
            System.out.println("5. Reset Order");
            System.out.println("6. Add and Checkout");
            String input = sc.nextLine();

            if(input.equalsIgnoreCase("1")){
                System.out.println("How many cups of Americano will you like to add/order?");
                input = sc.nextLine();
                ACount=Integer.parseInt(input);
                At=At+ACount;

                Coffee c1 = new ExtraGrindedCoffee((Coffee) new BlackCoffee());
                System.out.println(c1.prepareCoffee());
                System.out.println(c1.CoffeeMug());
                System.out.println(c1.Base());
                System.out.println(c1.Addition());
                System.out.println("Price per cup : "+c1.Price()+ " taka");
                System.out.println("You have ordered Americano : "+ACount+" cup(s)");
                Bill= Bill + ACount*160;
                System.out.println("Current Bill : "+Bill+" taka");

            }

            else if(input.equalsIgnoreCase("2")){
                System.out.println("How many cups of Expresso will you like to add/order?");
                input = sc.nextLine();
                ECount=Integer.parseInt(input);
                Et=Et+ECount;

                Coffee c2 = new DairyCream((Coffee) new BlackCoffee());
                System.out.println(c2.prepareCoffee());
                System.out.println(c2.CoffeeMug());
                System.out.println(c2.Base());
                System.out.println(c2.Addition());
                System.out.println("Price per cup : "+c2.Price()+ " taka");
                System.out.println("You have ordered Expresso : "+ECount+" cup(s)");
                Bill= Bill + ECount*170;
                System.out.println("Current Bill : "+Bill+" taka");

            }

            else if(input.equalsIgnoreCase("3")){
                System.out.println("How many cups of Cappuccino will you like to add/order?");
                input = sc.nextLine();
                CCount=Integer.parseInt(input);
                Ct=Ct+CCount;

                Coffee c3 = new CinamonPowder((Coffee) new MilkCoffee());
                System.out.println(c3.prepareCoffee());
                System.out.println(c3.CoffeeMug());
                System.out.println(c3.Base());
                System.out.println(c3.Addition());
                System.out.println("Price per cup : "+c3.Price()+ " taka");
                System.out.println("You have ordered Cappuccino : "+CCount+" cup(s)");
                Bill= Bill + CCount*230;
                System.out.println("Current Bill : "+Bill+" taka");

            }

            else if(input.equalsIgnoreCase("4")){
                System.out.println("How many cups of Mocha will you like to add/order?");
                input = sc.nextLine();
                MCount=Integer.parseInt(input);
                Mt=Mt+MCount;

                Coffee c4 = new ChocolateSauce((Coffee) new MilkCoffee());
                System.out.println(c4.prepareCoffee());
                System.out.println(c4.CoffeeMug());
                System.out.println(c4.Base());
                System.out.println(c4.Addition());
                System.out.println("Price per cup : "+c4.Price()+ " taka");
                System.out.println("You have ordered Cappuccino : "+MCount+" cup(s)");
                Bill= Bill + MCount*240;
                System.out.println("Current Bill : "+Bill+" taka");

            }

            else if(input.equalsIgnoreCase("5")){
                System.out.println("Your order has been reset");
                ACount=0;
                ECount=0;
                CCount=0;
                MCount=0;
                At=0;
                Et=0;
                Ct=0;
                Mt=0;
                Bill=0;

            }
            else if(input.equalsIgnoreCase("6")){
                System.out.println("Your have ordered:\n1. Americano : "+At+" cup(s)\n2. Expresso : "+Et+" cup(s)\n3. Cappuccino : "+Ct+" cup(s)\n4. Mocha : "+Mt+" cup(s)\n");
                System.out.println("Your total bill is : "+ Bill+" taka");
                break;
            }
        }


    }
}