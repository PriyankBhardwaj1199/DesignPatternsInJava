package com.DesignPattern.Behavioral.Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    // List of items in the cart
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
