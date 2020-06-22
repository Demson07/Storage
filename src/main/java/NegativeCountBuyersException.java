public class NegativeCountBuyersException extends RuntimeException{

    public NegativeCountBuyersException () {
        super("Неправильное количество покупателей.");
    }

}
