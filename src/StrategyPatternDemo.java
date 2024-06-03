import com.DesignPattern.Behavioral.Strategy.*;

public class StrategyPatternDemo {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 100);
        Item item2 = new Item("5678", 300);

        cart.addItem(item1);
        cart.addItem(item2);

        // Pay using Credit Card
        PaymentStrategy creditCardPayment = new CreditCardStrategy("1234567890123456", "John Doe", "123", "12/23");
        cart.pay(creditCardPayment);

        // Pay using PayPal
        PaymentStrategy payPalPayment = new PayPalStrategy("myemail@example.com", "mypassword");
        cart.pay(payPalPayment);

        // Pay using Bitcoin
        PaymentStrategy upiPayment = new UPIStrategy("upiID");
        cart.pay(upiPayment);
    }
}
