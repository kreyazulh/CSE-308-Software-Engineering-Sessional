package builders;

import components.Base;
import components.cooler.CPU_cooler;
import components.processor.Core_i5;
import product.Product;

public class PC1 implements PCBuilder{
    private final Product product;

    public PC1(){
        product = new Product();
    }

    @Override
    public void addBaseUnit() {
        product.add(new Base());
    }

    @Override
    public void addProcessor() {
        product.add(new Core_i5());
    }

    @Override
    public void addCooler() {
            product.add(new CPU_cooler());
    }

    @Override
    public void addDVDPlayer() {

    }

    @Override
    public Product getProduct() {
        return product;
    }

}
