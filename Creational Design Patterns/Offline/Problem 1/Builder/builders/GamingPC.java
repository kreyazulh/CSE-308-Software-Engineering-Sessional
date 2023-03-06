package builders;

import components.Base;
import components.processor.AMD_RYZEN_7;
import product.Product;

public class GamingPC implements PCBuilder{
    private final Product product;

    public GamingPC(){
        product = new Product();
    }
    @Override
    public void addBaseUnit() {
        product.add(new Base());
    }

    @Override
    public void addProcessor() {
        product.add(new AMD_RYZEN_7());
    }

    @Override
    public void addCooler() {

    }

    @Override
    public void addDVDPlayer() {

    }


    @Override
    public Product getProduct() {
        return product;
    }
}
