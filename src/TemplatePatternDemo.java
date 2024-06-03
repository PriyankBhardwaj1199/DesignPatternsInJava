import com.DesignPattern.Behavioral.Template.*;

public class TemplatePatternDemo {

    public static void main(String[] args) {
        ShoppingCart normalCart = new NormalUserCart();
        ShoppingCart premiumCart = new PremiumUserCart();

        System.out.println("Normal User Checkout:");
        normalCart.checkout();

        System.out.println("\nPremium User Checkout:");
        premiumCart.checkout();
    }
}
