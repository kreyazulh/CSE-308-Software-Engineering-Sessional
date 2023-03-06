public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void change(String i);
    public void notifyUser();
}
