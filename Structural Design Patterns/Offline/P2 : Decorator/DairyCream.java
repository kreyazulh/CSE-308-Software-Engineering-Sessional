public class DairyCream extends CoffeeDecorator{
    public DairyCream(Coffee typeCoffee) {
        super(typeCoffee);
    }
    public String prepareCoffee(){
        return super.prepareCoffee()+"---Coffee Expresso per cup---";
    }
    public String Addition(){
        return super.Addition()+"Dairy Cream : 40 taka";
    }
    public Integer Price(){
        return super.Price()+40;
    }
}
