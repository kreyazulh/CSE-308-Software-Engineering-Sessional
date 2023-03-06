package Components;

public class Almond_milk implements Components{
    @Override
    public int getPrice() {
        return 60;
    }

    @Override
    public String getDescription() {
        String Almond_milk="Almond milk instead of Milk";
        return Almond_milk;
    }
}
