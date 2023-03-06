import java.util.*;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        System.out.println("Enter your region from Asia, Europe or United States: "); //Asia, Europe or United States
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();

        Car car = carFactory.getCompany(str);

            System.out.println("Based on your location "+str+", We suggest you the car "+car.companyName());
            System.out.println("Manufactured in "+car.manufacturingCountry());
            System.out.println("Color is "+car.color()+", engine is "+ car.engine()+" and drivetrain is "+car.driveTrain());

    }
}
