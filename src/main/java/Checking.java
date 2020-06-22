import java.util.ArrayList;
import java.util.List;

public class Checking {

    static int checkCountBuyers (int count) {
        if (count < 1) {
            throw new NegativeCountBuyersException();
        } else {
            return count;
        }
    }

    static List<Buyer> addBuyersToList (int count) {
        List<Buyer> buyers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Buyer buyer = new Buyer();
            buyers.add(buyer);
        }
        return buyers;
    }
}
