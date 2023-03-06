import java.util.Scanner;

public class Main {

    private static Base root;
    private static Base current;

    private static Scanner scanner = new Scanner(System.in);

    private static String input;
    private static String input2;
    private static int choice;

    public static void createEntity() {
        System.out.print("\n" + "enter name: ");
        input = scanner.nextLine();

        if (choice == 1) {
            current = new Composite(input, "Company", "", current);
            current.getParent().addEntity(current);
        } else if (choice == 2) {
            input2 = scanner.nextLine();
            current = new Composite(input, "Manager", input2, current);
            current.getParent().addEntity(current);
        } else if (choice == 3) {
            current = new Leaf(input, "Developer","", current);
            current.getParent().addEntity(current);
        } else {
            /* do nothing */
        }
    }
    public static void main(String[] args) {
        root = new Composite("All Companies", "root", "", null);
        current = root;

        while(true) {

            System.out.println("Welcome to Company Creation!");
            System.out.println("1. create company");
            System.out.println("2. create manager");
            System.out.println("3. create developer");
            System.out.println("4. show hierarchy");
            System.out.println("5. show details of current");
            System.out.println("6. remove current");
            System.out.println("7. find");
            System.out.println("8. back");
            System.out.println("9. exit");

            choice = scanner.nextInt();
            input = scanner.nextLine();

            if(choice == 1) {
                if(current.getType().equalsIgnoreCase("root")) {
                    createEntity();
                    System.out.println("\n"+"-- new company created --"+"\n");
                } else {
                    System.out.println("\n"+"-- new company can not be created --"+"\n");
                }

            } else if(choice == 2) {
                if(current.getType().equalsIgnoreCase("company") ) {
                    createEntity();
                    System.out.println("\n"+"-- new manager created --"+"\n");
                } else {
                    System.out.println("\n"+"-- new manager can not be created --"+"\n");
                }

            } else if(choice == 3) {
                if(current.getType().equalsIgnoreCase("manager")) {
                    createEntity();
                    // current = current.getParent();
                    System.out.println("\n"+"-- new developer created --"+"\n");
                } else {
                    System.out.println("\n"+"-- new developer can not be created --"+"\n");
                }

            } else if(choice == 4) {
                System.out.println("\n"+current.getList(0)+"\n");

            } else if(choice == 5) {
                System.out.println("\n"+current.getDetails()+"\n");

            } else if(choice == 6) {
                Base temp = current.getParent();

                if(temp != null && current.getChildCount()==0) {
                    temp.removeEntity(current);
                    current = temp;

                    System.out.println("");
                } else {
                    System.out.println("\n"+"-- Can not be removed unless employees removed--"+"\n");
                }

            } else if(choice == 7) {
                if(current.getChildCount() == 0) {
                    System.out.println("\n"+"-- cannot find if current has no employees --"+"\n");
                } else {
                    int i, childCount = current.getChildCount();  // NOTICE

                    System.out.println("\n"+"finding:-");

                    for(i=0; i<childCount; i++) {
                        System.out.println("-- "+current.getChild(i).getName()+" ("+current.getChild(i).getType()+")");
                    }

                    System.out.print("\n"+"(role name): ");
                    input = scanner.nextLine();

                    for(i=0; i<childCount; i++) {
                        if(current.getChild(i).getName().equalsIgnoreCase(input)) {
                            current = current.getChild(i);
                            break;
                        }
                    }

                    if(i == childCount) {
                        System.out.println("\n"+"no such company/manager found, try again..."+"\n");
                    } else {
                        System.out.println("");
                    }
                }

            } else if(choice == 8) {
                if(!current.getType().equalsIgnoreCase("root")) {
                    current = current.getParent();
                }

                System.out.println("");

            } else if(choice == 9) {
                System.out.println("\n"+"exited");
                break;

            } else {
                System.out.println("\n"+"invalid choice made \n");
            }
        }

        return ;
    }
}