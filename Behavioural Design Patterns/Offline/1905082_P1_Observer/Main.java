import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean login = false;
        ServerABC ABC= new ServerABC();
        ServerDEF DEF= new ServerDEF();
        Observer user1 = new Premium("Reyazul", "Premium");
        Observer user2 = new Premium("Mubasshira", "Premium");
        Observer user3 = new Regular("Jalal", "Regular");

        ABC.registerObserver(user1);
        ABC.registerObserver(user2);
        DEF.registerObserver(user1);
        DEF.registerObserver(user2);
        ABC.registerObserver(user3);
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to ABC company and its services");
        System.out.println("Current Server Status: Fully Functional");


        while (true){

            if(login){
                System.out.println("\nYou are logged in as "+ABC.getUsername());
            }
            else{
                System.out.println("\nYou are not logged in");
            }

            System.out.println("\n1. Change Server Status");
            System.out.println("2. Register User");
            System.out.println("3. Log in as User");
            System.out.println("4. Show all Users");
            System.out.println("5. Show Users with DEF server access");
            System.out.println("6. Log out");
            System.out.println("7. Unregister User");
            System.out.println("8. Exit");
            String input = sc.nextLine();
            if(input.equals("1")){
                System.out.println("1. Change to fully functional");
                System.out.println("2. Change to partially functional");
                System.out.println("3. Change to fully down");
                input = sc.nextLine();
                ABC.stateControl(input);
                if(ABC.getStateInfo()==1){
                    Observer userX = new Premium(ABC.getLoggedName(), "Regular");
                    DEF.registerObserver(userX);
                }
                else if(ABC.getStateInfo()==2){
                    DEF.delByUser(ABC.getLoggedName());
                }

            }

            else if(input.equals("2")){
                System.out.println("Enter your username: ");
                String name = sc.nextLine();
                System.out.println("Choose your service: ");
                System.out.println("1. Regular");
                System.out.println("2. Premium");
                String status = sc.nextLine();
                if(status.equals("1")){
                    Observer userX = new Regular(name, "Regular");
                    ABC.registerObserver(userX);
                }
                else if(status.equals("2")){
                    Observer userX = new Premium(name, "Premium");
                    ABC.registerObserver(userX);
                    DEF.registerObserver(userX);
                }
                System.out.println("Congratulations! You have successfully registered to our service");


            }

            else if(input.equals("3")){
                System.out.println("Enter your username: ");
                input = sc.nextLine();
                login= ABC.login(input);
            }

            else if(input.equals("4")){
                ABC.getList();
            }
            else if(input.equals("5")){
                DEF.getList();
            }
            else if(input.equals("6")){
                System.out.println("You have successfully logged out");
                login=false;
                ABC.logOut();
            }
            else if(input.equals("7")){
                System.out.println("Enter username to unsubscribe: ");
                String delName = sc.nextLine();
                ABC.delByUser(delName);
                DEF.delByUser(delName);
                System.out.println("You have successfully unsubscribed from our service ");

            }
            else if(input.equals("8")){
                break;
            }
        }
    }
}