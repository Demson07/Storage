import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StorageAction {
    private static final Scanner scan = new Scanner(System.in);
    static List<Buyer> threadList = new ArrayList<>();
    public static void main(String[] args) {
        System.out.print("Сколько покупателей будет в магазине? >");
        int countBuyers = scan.nextInt();

        Checking.checkCountBuyers(countBuyers);

        Checking.addBuyersToList(countBuyers);

        
    }
}
