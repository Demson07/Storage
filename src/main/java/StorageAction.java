import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StorageAction {
    private static final Scanner scan = new Scanner(System.in);
    static List<Buyer> buyerList = new ArrayList<>();
    public static void main(String[] args) {
        Storage storage = new Storage();
        System.out.print("Сколько покупателей будет в магазине? >");
        int countBuyers = scan.nextInt();

        try {
            Checking.checkCountBuyers(countBuyers);
        } catch (NegativeCountBuyersException e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < countBuyers; i++) {
            Buyer buyer = new Buyer(storage);
            buyerList.add(buyer);
            BuyerThread buyerThread = new BuyerThread(buyer);
            buyerThread.start();
        }
    }
}
