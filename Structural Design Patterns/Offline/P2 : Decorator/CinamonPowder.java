public class CinamonPowder extends CoffeeDecorator{
    public CinamonPowder(Coffee typeCoffee) {
        super(typeCoffee);
    }
    public String prepareCoffee(){
        return super.prepareCoffee()+"---Coffee Cappuccino per cup---";
    }
    public String Addition(){
        return super.Addition()+"Cinnamon Powder : 50 taka";
    }
    public Integer Price(){
        return super.Price()+50;
    }
}
