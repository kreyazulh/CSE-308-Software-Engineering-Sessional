import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServerABC implements Subject{
    private List<Observer> observers;
    private String loggedName;
    private String stateControl="1";
    private Integer stateInfo =0; //1 for DEF reg, 2 for DEF unsubscrsibe
    private String prevState;
    StringBuffer result = new StringBuffer();
    Scanner sc = new Scanner(System.in);
    Boolean login = false;



    public ServerABC(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void delByUser(String s) {
        for(int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            if(s.equalsIgnoreCase(observer.getName())){
                removeObserver(observer);
            }
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if(!observers.isEmpty()) {
            observers.remove(o);
        }

    }

    public void stateControl(String s){
        prevState=stateControl;
        if(stateControl.equalsIgnoreCase(s) && stateControl.equalsIgnoreCase("1")){
            System.out.println("ABC server is already in fully functional state");
            System.out.println("Current Server Status: Fully Functional");
        }
        else if(stateControl.equalsIgnoreCase(s) && stateControl.equalsIgnoreCase("2")){
            System.out.println("ABC server is already in partially functional state");
            System.out.println("Current Server Status: Partially functional");
        }
        else if(stateControl.equalsIgnoreCase(s) && stateControl.equalsIgnoreCase("3")){
            System.out.println("ABC server is already in down");
            System.out.println("Current Server Status: Fully down");
        }
        else if (s.equalsIgnoreCase("1")){
            System.out.println("ABC server is fully functional again!");
            stateControl="1";
            System.out.println("Current Server Status: Fully Functional");
            System.out.println("\n---Server side notifications---");
            for(int i = 0; i < observers.size(); i++) {
                Observer observer = observers.get(i);
                if(observer.getStatus().equalsIgnoreCase("Premium")){
                    updateP(prevState, stateControl, observer.getName());
                }
                else
                    updateR(prevState, stateControl, observer.getName());

            }
            for(int i = 0; i < observers.size(); i++) {
                Observer observer = observers.get(i);
                if(login && observer.getName().equalsIgnoreCase(loggedName) && observer.getStatus().equalsIgnoreCase("Premium")){
                    updateLoggedP(prevState, stateControl, observer.getName());
                }
                else if(login && observer.getName().equalsIgnoreCase(loggedName) && observer.getStatus().equalsIgnoreCase("Regular")){
                    updateLoggedR(prevState, stateControl, observer.getName());
                }

            }

        }
        else if (s.equalsIgnoreCase("2")){
            System.out.println("ABC server is partially working right now");
            stateControl="2";
            System.out.println("Current Server Status: Partially functional");
            System.out.println("\n---Server side notifications---");
            for(int i = 0; i < observers.size(); i++) {
                Observer observer = observers.get(i);
                if(observer.getStatus().equalsIgnoreCase("Premium")){
                    updateP(prevState, stateControl, observer.getName());
                }
                else
                    updateR(prevState, stateControl, observer.getName());

            }
            for(int i = 0; i < observers.size(); i++) {
                Observer observer = observers.get(i);
                if(login && observer.getName().equalsIgnoreCase(loggedName) && observer.getStatus().equalsIgnoreCase("Premium")){
                    updateLoggedP(prevState, stateControl, observer.getName());
                }
                else if(login && observer.getName().equalsIgnoreCase(loggedName) && observer.getStatus().equalsIgnoreCase("Regular")){
                    updateLoggedR(prevState, stateControl, observer.getName());
                }

            }
        }
        else if (s.equalsIgnoreCase("3")){
            System.out.println("Sorry! ABC server crashed");
            stateControl="3";
            System.out.println("Current Server Status: Fully down");
            System.out.println("\n---Server side notifications---");
            for(int i = 0; i < observers.size(); i++) {
                Observer observer = observers.get(i);
                if(observer.getStatus().equalsIgnoreCase("Premium")){
                    updateP(prevState, stateControl, observer.getName());
                }
                else
                    updateR(prevState, stateControl, observer.getName());

            }
            for(int i = 0; i < observers.size(); i++) {
                Observer observer = observers.get(i);
                if(login && observer.getName().equalsIgnoreCase(loggedName) && observer.getStatus().equalsIgnoreCase("Premium")){
                    updateLoggedP(prevState, stateControl, observer.getName());
                }
                else if(login && observer.getName().equalsIgnoreCase(loggedName) && observer.getStatus().equalsIgnoreCase("Regular")){
                    updateLoggedR(prevState, stateControl, observer.getName());
                }

            }
        }


    }

    @Override
    public void updateP(String s, String t, String n) {
        String name=n;
        if(s.equalsIgnoreCase("1") && t.equalsIgnoreCase("2")){

                System.out.println(name+"--- You can continue using full service from both servers or keep using partial service");

        }
        else if(s.equalsIgnoreCase("1") && t.equalsIgnoreCase("3")){

                System.out.println(name+"--- The service will now be provided from DEF server");

        }
        else if(s.equalsIgnoreCase("2") && t.equalsIgnoreCase("1")){

            System.out.println(name+"--- You were using services from two servers or fully from DEF server, now full service will be given by ABC server");

        }
        else if(s.equalsIgnoreCase("3") && t.equalsIgnoreCase("2")){

            System.out.println(name+"--- [no update]");

        }
        else if(s.equalsIgnoreCase("3") && t.equalsIgnoreCase("1")){

            System.out.println(name+"--- [no update]");

        }
        else if(s.equalsIgnoreCase("2") && t.equalsIgnoreCase("3")){

            System.out.println(name+"--- [no update]");

        }

    }

    @Override
    public void updateLoggedP(String s, String t, String n) {
        String name=n;
        System.out.println("\n\n");
        System.out.println("---User side notifications---");
        System.out.println("User: "+name+"\n");
        if(s.equalsIgnoreCase("1") && t.equalsIgnoreCase("2")){

            System.out.println("Would you like to use service partially from two servers or use DEF server services completely?");
            System.out.println("1. Service from both servers");
            System.out.println("2. Service from DEF server");
            String input= sc.nextLine();
            if (input.equalsIgnoreCase("1")){
                System.out.println("You wil be using service partially from both servers");
            }
            else if(input.equalsIgnoreCase("2")){
                System.out.println("You wil be using full service from DEF server");
            }
            stateInfo=0;

        }
        else if(s.equalsIgnoreCase("1") && t.equalsIgnoreCase("3")){

            System.out.println("All the services will now be provided by our partner company's DEF server");
            stateInfo=0;

        }
        else if(s.equalsIgnoreCase("2") && t.equalsIgnoreCase("3")){

            System.out.println("Please note that if you were using both server services, all the services will now be provided by DEF server only");
            stateInfo=0;

        }
    }

    @Override
    public void updateR(String s, String t, String n) {
        String name=n;
        if(s.equalsIgnoreCase("1") && t.equalsIgnoreCase("2")){

                System.out.println(name+"--- You can pay 20$ per hour to continue using full service from DEF server or keep using partial service");

        }
        else if(s.equalsIgnoreCase("1") && t.equalsIgnoreCase("3")){

                System.out.println(name+"--- Please pay 20$ per hour to continue using our service from DEF server");

        }
        else if(s.equalsIgnoreCase("2") && t.equalsIgnoreCase("1")){

            System.out.println(name+"--- Services from ABC server is fully available. If you were paying for DEF server, your total bill is sent");

        }
        else if(s.equalsIgnoreCase("3") && t.equalsIgnoreCase("1")){

            System.out.println(name+"--- Service providing from ABC server resumed. If you were paying for DEF server, your total bill is sent");

        }
        else if(s.equalsIgnoreCase("3") && t.equalsIgnoreCase("2")){

            System.out.println(name+"--- [no update]");

        }
        else if(s.equalsIgnoreCase("2") && t.equalsIgnoreCase("3")){

            System.out.println(name+"--- [no update]");

        }

    }

    @Override
    public void updateLoggedR(String s, String t, String n) {
        String name = n;
        System.out.println("\n\n");
        System.out.println("---User side notifications---");
        System.out.println("User: " + name + "\n");
        if (s.equalsIgnoreCase("1") && t.equalsIgnoreCase("2")) {

            System.out.println("Would you like to pay 20$ per hour to enjoy full service provided by DEF or continue with partial service?");
            System.out.println("1. Pay 20$");
            System.out.println("2. Skip");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("1")) {
                System.out.println("Congratulations! All your data is now backed up in DEF server and you can use DEF server provided services");
                stateInfo = 1;
            } else if (input.equalsIgnoreCase("2")) {
                System.out.println("You will be using partial services from ABC server");
                stateInfo = 0;
            }

        } else if (s.equalsIgnoreCase("1") && t.equalsIgnoreCase("3")) {

            System.out.println("Would you like to pay 20$ per hour to enjoy full service provided by DEF or discontinue using services till ABC server is back again?");
            System.out.println("1. Pay 20$");
            System.out.println("2. Skip");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("1")) {
                System.out.println("Congratulations! All your data is now backed up in DEF server and you can use DEF server provided services");
                stateInfo = 1;
            } else if (input.equalsIgnoreCase("2")) {
                System.out.println("Please wait till ABC server is functional again");
                stateInfo = 0;
            }

        }
        else if (s.equalsIgnoreCase("2") && t.equalsIgnoreCase("1")) {

            System.out.println("ABC server working partially again and can be used. Your total bill is charged from your credit card if you chose DEF services");

            stateInfo = 2;

        }
        else if (s.equalsIgnoreCase("3") && t.equalsIgnoreCase("1")) {

            System.out.println("ABC server fully working now. Your total bill is charged from your credit card if you chose DEF services");

            stateInfo = 2;

        }
    }

    @Override
    public Boolean login(String s) {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            if (s.equalsIgnoreCase(observer.getName())) {
                System.out.println("---You have successfully logged in as " + observer.getName() + "!");
                login= true;
                loggedName=observer.getName();
                username(observer.getName(), observer.getStatus());
                break;
            }
            else if(i==(observers.size()-1) && !(s.equalsIgnoreCase(observer.getName()))) {
                System.out.println("---Username not registered. Please try again with valid credentials");
                login= false;
            }

        }
        return login;
    }

    @Override
    public void username(String s, String t) {
        result.append(s);
        result.append(", Status: ");
        result.append(t);
        getUsername();
    }

    public CharSequence getUsername(){
        return result;
    }

    public void getList(){
        System.out.println("---All registered users---");

        for(int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            System.out.println("Name: "+observer.getName()+", Status: "+observer.getStatus());
        }
    }

    @Override
    public void logOut() {
        loggedName=null;
        result.setLength(0);
    }

    @Override
    public Integer getStateInfo() {
        return stateInfo;
    }

    @Override
    public String getLoggedName() {
        return loggedName;
    }
}
