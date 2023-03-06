package builders;

import components.Base;
import components.cooler.Liquid_cooler;
import components.processor.Core_i7;
import product.Product;

public class PC2 implements PCBuilder{
    private final Product product;

    public PC2(){
        product = new Product();
    }

    @Override
    public void addBaseUnit() {
        product.add(new Base());
    }

    @Override
    public void addProcessor() {
        product.add(new Core_i7());
    }

    @Override
    public void addCooler() {
        product.add(new Liquid_cooler());
    }

    @Override
    public void addDVDPlayer() {
    }



    @Override
    public Product getProduct() {
        return product;
    }
}
