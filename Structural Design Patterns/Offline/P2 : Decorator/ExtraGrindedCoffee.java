public class ExtraGrindedCoffee extends CoffeeDecorator{
    public ExtraGrindedCoffee(Coffee typeCoffee) {
        super(typeCoffee);
    }
    public String prepareCoffee(){
        return super.prepareCoffee()+"---Coffee Americano per cup---";
    }
    public String Addition(){
        return super.Addition()+"Extra grinded Coffee : 30 taka";
    }
    public Integer Price(){
        return super.Price()+30;
    }
}
