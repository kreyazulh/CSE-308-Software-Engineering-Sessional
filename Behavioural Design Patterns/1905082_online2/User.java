public class User implements Observer{
   private String name;
    public User(String name){
        this.name=name;
    }
    @Override
    public void update(String s) {

    }

    @Override
    public String getStatus() {
        return null;
    }
}
