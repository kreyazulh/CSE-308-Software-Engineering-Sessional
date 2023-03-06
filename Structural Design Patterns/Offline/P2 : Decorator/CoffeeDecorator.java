public abstract class CoffeeDecorator implements Coffee {
    private Coffee typeCoffee;
    public CoffeeDecorator(Coffee typeCoffee){
        this.typeCoffee=typeCoffee;
    }
    @Override
    public String prepareCoffee(){
        return typeCoffee.prepareCoffee();
    }
    @Override
    public String CoffeeMug(){
        return typeCoffee.CoffeeMug();
    }
    @Override
    public String Base(){
        return typeCoffee.Base();
    }
    @Override
    public String Addition(){
        return typeCoffee.Addition();
    }
    public Integer Price(){
        return typeCoffee.Price();
    }

}
