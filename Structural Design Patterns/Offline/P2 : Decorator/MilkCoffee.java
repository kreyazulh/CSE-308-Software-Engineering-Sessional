public class MilkCoffee implements Coffee{
    @Override
    public String prepareCoffee() {
        return "";
    }

    @Override
    public String CoffeeMug() {
        return "Fancy Coffee Cup : 100 taka";
    }

    @Override
    public String Base() {
        return "Grinded Coffee beans : 30 taka\nMilk : 50 taka";
    }

    @Override
    public String Addition() {
        return "";
    }

    @Override
    public Integer Price() {
        return 180;
    }
}
