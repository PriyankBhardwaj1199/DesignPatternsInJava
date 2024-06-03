import com.DesignPattern.Structural.Decorator.HoneyDecorator;
import com.DesignPattern.Structural.Decorator.IceCream;
import com.DesignPattern.Structural.Decorator.NuttyDecorator;
import com.DesignPattern.Structural.Decorator.SimpleIcecream;

public class DecoratorPatternDemo {

    public static void main(String args[]) {
        IceCream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
        System.out.println(icecream.makeIcecream());
    }
}
