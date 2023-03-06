package Components;

public class Cookies implements Components {
    @Override
    public int getPrice() {
        return 40;
    }

    @Override
    public String getDescription() {
        String Cookies="Cookies added";
        return Cookies;
    }
}
