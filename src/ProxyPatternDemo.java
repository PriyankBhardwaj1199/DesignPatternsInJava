import com.DesignPattern.Structural.proxy.InternetAccess;
import com.DesignPattern.Structural.proxy.ProxyEmployeeInternetAccess;

public class ProxyPatternDemo {

    public static final String EMPLOYEE_NAME = "Alex Mace";

    public static void main(String[] args) {
        InternetAccess internetAccess = new ProxyEmployeeInternetAccess(EMPLOYEE_NAME);
        internetAccess.grantInternetAccessToEmployees();
    }
}
