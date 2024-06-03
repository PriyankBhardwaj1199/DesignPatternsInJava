package com.DesignPattern.Behavioral.Template;

public class NormalUserCart extends ShoppingCart{

    @Override
    protected void addItemsToCart() {
        System.out.println("Adding items to normal user's cart.");
    }

    @Override
    protected void applyDiscount() {
        System.out.println("Applying standard discount for normal user.");
    }
}
