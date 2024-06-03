package com.DesignPattern.Behavioral.Template;

public abstract class ShoppingCart {

    // Template method
    public final void checkout() {
        addItemsToCart();
        calculateTotalPrice();
        applyDiscount();
        processPayment();
    }

    // Steps with a default implementation or abstract methods
    protected abstract void addItemsToCart();

    protected void calculateTotalPrice() {
        System.out.println("Calculating total price of items in the cart.");
    }

    protected abstract void applyDiscount();

    protected void processPayment() {
        System.out.println("Processing payment for the order.");
    }
}
