import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App implements Subject{
    private List<Observer> observers;
    private String stateControl="1";
    public App(){
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(!observers.isEmpty()) {
            observers.remove(o);
        }
    }

    @Override
    public void change(String i) {
        if (i.equalsIgnoreCase("1"))
        {
            System.out.println("User notification: The weather is sunny and temperature 30");
            stateControl="1";
        }
        else if (i.equalsIgnoreCase("2"))
        {
            System.out.println("User notification: The weather is rainy and temperature 20");
            stateControl="2";
        }
        else if (i.equalsIgnoreCase("3"))
        {
            System.out.println("User notification: The weather is snowy and temperature 10");
            stateControl="3";
        }
        else if(i.equalsIgnoreCase("4")){
            System.out.println("User notification: Alert: Heavy rain!");
            stateControl="4";
        }
        else if(i.equalsIgnoreCase("5")){
            System.out.println("User notification: Alert: Heavy snow!");
            stateControl="5";
        }
    }

    @Override
    public void notifyUser() {

    }
}
