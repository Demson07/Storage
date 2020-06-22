public class BuyerThread extends Thread{

    private Buyer buyer;

    public BuyerThread(Buyer buyer) {
        this.buyer = buyer;
    }

    @Override
    public void run() {
        buyer.purchaseOfGoods();
    }
}
