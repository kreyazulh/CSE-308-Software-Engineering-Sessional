public class ChocolateSauce extends CoffeeDecorator{
    public ChocolateSauce(Coffee typeCoffee) {
        super(typeCoffee);
    }
    public String prepareCoffee(){
        return super.prepareCoffee()+"---Coffee Mocha per cup---";
    }
    public String Addition(){
        return super.Addition()+"Chocolate Sauce : 60 taka";
    }
    public Integer Price(){
        return super.Price()+60;
    }
}
