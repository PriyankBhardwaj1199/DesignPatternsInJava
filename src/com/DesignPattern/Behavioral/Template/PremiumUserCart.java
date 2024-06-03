package com.DesignPattern.Behavioral.Template;

public class PremiumUserCart extends ShoppingCart{

    @Override
    protected void addItemsToCart() {
        System.out.println("Adding items to premium user's cart.");
    }

    @Override
    protected void applyDiscount() {
        System.out.println("Applying premium discount for premium user.");
    }
}
