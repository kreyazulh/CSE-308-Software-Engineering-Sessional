package Components;

public class Candy implements Components{
    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String getDescription() {
        String Candy="Candy added";
        return Candy;
    }
}
