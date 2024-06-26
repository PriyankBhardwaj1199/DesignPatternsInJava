package com.DesignPattern.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory implements ProductComponent{

    private String categoryName;
    private List<ProductComponent> products = new ArrayList<>();

    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public void addProduct(ProductComponent product) {
        products.add(product);
    }

    @Override
    public void displayInfo() {
        System.out.println("Category: " + categoryName);
        for (ProductComponent product : products) {
            product.displayInfo();
        }
    }
}
