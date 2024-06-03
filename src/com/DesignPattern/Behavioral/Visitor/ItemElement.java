package com.DesignPattern.Behavioral.Visitor;

public interface ItemElement {

    int accept(ShoppingCartVisitor visitor);
}
