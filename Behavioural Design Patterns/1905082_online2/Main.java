import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        Observer user1 = new User("Reyazul");
        Observer user2 = new User("Rezaul");

        app.registerObserver(user1);
        app.registerObserver(user2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Weather Forcast");
        System.out.println("Current Weather:  Sunny, Temperature: 30 degree celcius");

        while (true) {


            System.out.println("\n1. Change Weather");
            System.out.println("2. Register User");
            System.out.println("3. Unregister User");
            System.out.println("4. Exit");
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("1")){
                System.out.println("1. Sunny, temperature: 20");
                System.out.println("2. Rainy, temperature 30");
                System.out.println("3. Snowy, temperature 10");
                System.out.println("4. Heavy rain alert!");
                System.out.println("5. Heavy snow alert!");
                input = sc.nextLine();
                app.change(input);
            }

            if(input.equalsIgnoreCase("4"))
                break;
        }
    }
}