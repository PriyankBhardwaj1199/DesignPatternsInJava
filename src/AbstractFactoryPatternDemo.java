import com.DesignPattern.Creational.abstractFactory.AbstractFactory;
import com.DesignPattern.Creational.abstractFactory.Imobile;
import com.DesignPattern.Creational.abstractFactory.MobileFactoryProducer;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory abstractFactory1 = MobileFactoryProducer.getFactory(false);
        Imobile onePlus = abstractFactory1.getMobile("Oneplus");
        onePlus.brandName();
        Imobile sony = abstractFactory1.getMobile("Sony");
        sony.brandName();
        Imobile lava = abstractFactory1.getMobile("Lava");
        lava.brandName();
        AbstractFactory abstractFactory2 = MobileFactoryProducer.getFactory(true);
        Imobile iphone = abstractFactory2.getMobile("iPhone");
        iphone.brandName();
    }
}
