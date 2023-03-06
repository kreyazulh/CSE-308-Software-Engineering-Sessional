package Product;
import Components.*;

import java.util.LinkedList;

public class Product {
    private int totalCost;
    private final LinkedList<Components>components;

    public Product() {
        this.totalCost = 0;
        this.components= new LinkedList<>();
    }

    public void add(Components c){
        components.add(c);
        totalCost +=c.getPrice();
    }

    public void show(){
        System.out.println("Your order is: ");
        System.out.println("Base components:");
        Components shake = components.get(0);
        System.out.println(shake.getDescription()+"\t----price: "+shake.getPrice());
        System.out.println("Added components:");
        for(int i=1; i<components.size(); i++){
            if(components.get(i)!=null) {
                shake = components.get(i);
                System.out.println(i+". "+shake.getDescription()+"\t----price: "+ shake.getPrice());
            }
        }
        System.out.println("Total price: "+ totalCost);
    }
}
