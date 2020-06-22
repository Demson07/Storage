import java.util.Random;

public class Buyer {

    private int totalGoods = 0;
    Storage storage;
    private int count;

    Random random = new Random();

    public Buyer(Storage storage) {
        this.storage = storage;
    }

    public int getCount() {
        return count;
    }


    public int getTotalGoods() {
        return totalGoods;
    }

    public synchronized void purchaseOfGoods() {
        while (true) {
            int countGoods = random.nextInt(10 - 1 + 1) + 1;
            if (countGoods > storage.getGoods()) {
                if (storage.getGoods() != 0) {
                    totalGoods += storage.getGoods();
                    count++;
                    storage.setGoods(0);
                }
                System.out.println(this + " забрал " + getTotalGoods() + "товара, произвел покупок: " + getCount());
                break;
            } else {
                totalGoods += countGoods;
                count++;
                storage.setGoods(storage.getGoods() - countGoods);

            }
        }
    }
}
