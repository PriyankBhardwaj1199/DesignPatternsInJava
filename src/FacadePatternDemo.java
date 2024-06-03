import com.DesignPattern.Structural.Facade.ShopKeeper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternDemo {

    private static int choice;

    public static void main(String args[]) throws NumberFormatException, IOException {
        do {
            System.out.print("========= Mobile Shop ============ \n");
            System.out.print("1. IPHONE.              \n");
            System.out.print("2. SAMSUNG.              \n");
            System.out.print("3. NOKIA.                 \n");
            System.out.print("4. Exit.                   \n");
            System.out.print("Enter your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            ShopKeeper shopKeeper = new ShopKeeper();

            switch (choice) {
                case 1:
                {
                    shopKeeper.iphonePhoneSale();
                }
                break;
                case 2:
                {
                    shopKeeper.samsungPhoneSale();
                }
                break;
                case 3:
                {
                    shopKeeper.nokiaPhoneSale();
                }
                break;
                default:
                {
                    System.out.println("Ohh!!! You are in no mood to shop today.");
                }
                return;
            }
        } while (choice != 4);
    }
}
