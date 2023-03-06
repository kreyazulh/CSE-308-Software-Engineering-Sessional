package builders;

import product.Product;

//basic structure of a pc
public interface PCBuilder {
    void addBaseUnit();
    void addProcessor();
    void addCooler();
    void addDVDPlayer();

    Product getProduct();
}
