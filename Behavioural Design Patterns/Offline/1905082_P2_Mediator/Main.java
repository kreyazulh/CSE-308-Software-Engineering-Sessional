import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        ECMMain exam= new ECMMain();
        Scanner sc = new Scanner(System.in);
        exam.publish();
        exam.scruitinize();
        exam.checkedPublish();

        while(true) {
            System.out.println("\nWelcome to Result Board Website!");
            System.out.println("1. Check individual result");
            System.out.println("2. Recheck");
            System.out.println("3. Check total result");
            System.out.println("4. Exit");
            String input = sc.nextLine();
            if(input.equals("1")){
                System.out.println("Enter your roll no (1-5): ");
                input = sc.nextLine();
                exam.individual(input);
            }
            else if(input.equals("2")){
                System.out.println("Enter your roll no (1-5): ");
                input = sc.nextLine();
                exam.rescruitize(input);
            }
            else if(input.equals("3")){
                exam.boardResult();
            }
            else if(input.equals("4")){
                break;
            }


        }
    }
}