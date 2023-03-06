import java.util.ArrayList;
import java.util.List;

public class ServerDEF implements Subject{
    private List<Observer> observers;
    public ServerDEF(){
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

    @Override
    public void updateP(String s, String t, String name) {

    }

    @Override
    public void updateLoggedP(String s, String t, String name) {

    }

    @Override
    public void updateR(String s, String t, String name) {

    }

    @Override
    public void updateLoggedR(String s, String t, String name) {

    }

    @Override
    public Boolean login(String s) {
        return null;
    }

    @Override
    public void username(String s, String t) {

    }

    @Override
    public void getList() {
        System.out.println("---Users who have access to DEF server---");

        for(int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            System.out.println("Name: "+observer.getName()+", Status: "+observer.getStatus());
        }
    }

    @Override
    public void logOut() {

    }

    @Override
    public Integer getStateInfo() {
        return null;
    }

    @Override
    public String getLoggedName() {
        return null;
    }

}

