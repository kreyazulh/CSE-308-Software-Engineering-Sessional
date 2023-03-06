public interface Subject {
    public void registerObserver(Observer o);
    public void delByUser(String s);
    public void removeObserver(Observer o);
    public void updateP(String s, String t, String name);
    public void updateLoggedP(String s, String t, String name);
    public void updateR(String s, String t, String name);
    public void updateLoggedR(String s, String t, String name);
    public Boolean login(String s);
    public void username(String s, String t);
    public void getList();
    public void logOut();
    public Integer getStateInfo();
    public String getLoggedName();

}
