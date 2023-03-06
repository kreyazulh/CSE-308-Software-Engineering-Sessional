package builders;

import components.Base;
import components.DVD;
import components.processor.Core_i9;
import product.Product;

public class PC3 implements PCBuilder{
    private final Product product;

    public PC3(){
        product = new Product();
    }
    @Override
    public void addBaseUnit() {
        product.add(new Base());
    }

    @Override
    public void addProcessor() {
        product.add(new Core_i9());
    }

    @Override
    public void addCooler() {

    }

    @Override
    public void addDVDPlayer() {
        product.add(new DVD());
    }


    @Override
    public Product getProduct() {
        return product;
    }
}
