public class PriceExceptions extends Exception {
    private int wrongPrice;

    public int getWrongPrice() {
        return wrongPrice;
    }

    public PriceExceptions(String message, int wrongPrice) {
        super(message);
        this.wrongPrice = wrongPrice;
    }
}
